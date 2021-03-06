// ------------------------------------------------------------------------------
// -- Copyright ERTMS Solutions
// -- Licensed under the EUPL V.1.1
// -- http://joinup.ec.europa.eu/software/page/eupl/licence-eupl
// --
// -- This file is part of ERTMSFormalSpec software and documentation
// --
// --  ERTMSFormalSpec is free software: you can redistribute it and/or modify
// --  it under the terms of the EUPL General Public License, v.1.1
// --
// -- ERTMSFormalSpec is distributed in the hope that it will be useful,
// -- but WITHOUT ANY WARRANTY; without even the implied warranty of
// -- MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
// --
// ------------------------------------------------------------------------------
using System;
using System.Collections.Generic;
using System.Windows.Forms;


namespace GUI.DataDictionaryView
{
    public class ParametersTreeNode : FunctionTreeNode
    {
        private class ItemEditor : NamedEditor
        {
            /// <summary>
            /// Constructor
            /// </summary>
            public ItemEditor()
                : base()
            {
            }
        }

        /// <summary>
        /// Constructor (for function)
        /// </summary>
        /// <param name="item"></param>
        public ParametersTreeNode(DataDictionary.Functions.Function item, bool buildSubNodes)
            : base(item, buildSubNodes, "Parameters", true, false)
        {
        }

        /// <summary>
        /// Builds the subnodes of this node
        /// </summary>
        /// <param name="buildSubNodes">Indicates that subnodes of the nodes built should also </param>
        public override void BuildSubNodes(bool buildSubNodes)
        {
            Nodes.Clear();

            foreach (DataDictionary.Parameter parameter in Item.FormalParameters)
            {
                Nodes.Add(new ParameterTreeNode(parameter, buildSubNodes));
            }
            SubNodesBuilt = true;
        }

        /// <summary>
        /// Creates the editor for this tree node
        /// </summary>
        /// <returns></returns>
        protected override Editor createEditor()
        {
            return new ItemEditor();
        }

        /// <summary>
        /// Create structure based on the subsystem structure
        /// </summary>
        /// <param name="SourceNode"></param>
        public override void AcceptDrop(BaseTreeNode SourceNode)
        {
            base.AcceptDrop(SourceNode);

            if (SourceNode is ParameterTreeNode)
            {
                ParameterTreeNode node = SourceNode as ParameterTreeNode;
                DataDictionary.Parameter parameter = node.Item;
                node.Delete();
                AddParameter(parameter);
            }
        }

        public void AddHandler(object sender, EventArgs args)
        {
            DataDictionaryTreeView treeView = BaseTreeView as DataDictionaryTreeView;
            if (treeView != null)
            {
                DataDictionary.Parameter parameter = (DataDictionary.Parameter)DataDictionary.Generated.acceptor.getFactory().createParameter();
                parameter.Name = "<Parameter" + (GetNodeCount(false) + 1) + ">";
                AddParameter(parameter);
            }
        }

        /// <summary>
        /// Adds a new parameter
        /// </summary>
        /// <param name="function"></param>
        public ParameterTreeNode AddParameter(DataDictionary.Parameter parameter)
        {
            Item.appendParameters(parameter);
            ParameterTreeNode retVal = new ParameterTreeNode(parameter, true);
            Nodes.Add(retVal);

            return retVal;
        }

        /// <summary>
        /// The menu items for this tree node
        /// </summary>
        /// <returns></returns>
        protected override List<MenuItem> GetMenuItems()
        {
            List<MenuItem> retVal = new List<MenuItem>();

            retVal.Add(new MenuItem("Add", new EventHandler(AddHandler)));

            return retVal;
        }
    }
}
