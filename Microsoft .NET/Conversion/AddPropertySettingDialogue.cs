#region Copyright and file header
//  ********************************************************
//              Muhimbi Document Converter Service
//
//                 Copyright 2021, Muhimbi Ltd
//                       www.muhimbi.com
//
//                     All rights reserved
//
//            Original Document author: balazs.molnar
//
//       Filename: AddPropertySettingDialogue.cs
//          To do: -
//   Known issues: -
//        History: 16/11/2021 - BM - Initial version
//
//  ********************************************************
#endregion Copyright and file header

using System;
using System.Windows.Forms;

namespace TestHarness
{
    /// <summary>
    /// Form to help user adding a document property setting
    /// </summary>
    public partial class AddPropertySettingDialogue : Form
    {
        /// <summary>
        /// The property category
        /// </summary>
        public string Category { get; private set; }

        /// <summary>
        /// The property names
        /// </summary>
        public string Names { get; private set; }

        /// <summary>
        /// Constructor
        /// </summary>
        public AddPropertySettingDialogue()
        {
            InitializeComponent();

            // Initialize combo boxes
            comboBoxCategory.Items.Clear();
            comboBoxCategory.Items.AddRange(Enum.GetNames(typeof(DocumentConverterService.PropertyCategories)));

            comboBoxName.Items.Clear();
            comboBoxName.Items.Add("--- Word Properties ---");
            comboBoxName.Items.AddRange(Enum.GetNames(typeof(DocumentConverterService.WordBuiltInProperties)));
            comboBoxName.Items.Add("--- PDF Properties ---");
            comboBoxName.Items.AddRange(Enum.GetNames(typeof(DocumentConverterService.PdfBuiltInProperties)));
        }

        /// <summary>
        /// Closes the dialogue with "Cancel" result
        /// </summary>
        /// <param name="sender"></param>
        /// <param name="e"></param>
        private void buttonCancel_Click(object sender, EventArgs e)
        {
            this.DialogResult = DialogResult.Cancel;
            this.Close();
        }

        /// <summary>
        /// Sets up Category and Names parameters then closes
        /// the dialogue with "OK" result
        /// </summary>
        /// <param name="sender"></param>
        /// <param name="e"></param>
        private void buttonAdd_Click(object sender, EventArgs e)
        {
            Category = comboBoxCategory.Text;
            Names = textBoxNames.Text;
            this.DialogResult = DialogResult.OK;
            this.Close();
        }

        /// <summary>
        /// Adds the selected name to the end of the list of names
        /// </summary>
        /// <param name="sender"></param>
        /// <param name="e"></param>
        private void buttonAddName_Click(object sender, EventArgs e)
        {
            // Add comma if needed
            if (string.IsNullOrEmpty(textBoxNames.Text) == false)
            {
                textBoxNames.Text += ", ";
            }

            // Append new value
            textBoxNames.Text += comboBoxName.Text;
        }
    }
}
