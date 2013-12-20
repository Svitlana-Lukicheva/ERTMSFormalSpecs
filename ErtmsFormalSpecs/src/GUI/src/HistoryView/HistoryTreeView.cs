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
namespace GUI.HistoryView
{
    using DataDictionary;

    public class HistoryTreeView : TypedTreeView<Utils.IModelElement>
    {
        protected override void BuildModel()
        {
            Nodes.Clear();
            ModelElement modelElement = Root as ModelElement;
            if (modelElement != null)
            {
                DataDictionary.Compare.History history = modelElement.EFSSystem.History;
                foreach (HistoricalData.Change change in history.GetChanges(modelElement))
                {
                    ChangeTreeNode node = new ChangeTreeNode(change);
                    Nodes.Add(node);
                }
            }
        }
    }
}