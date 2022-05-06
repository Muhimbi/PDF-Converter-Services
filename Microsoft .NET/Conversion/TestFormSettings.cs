#region Copyright and file header
//  ********************************************************
//              Muhimbi Document Converter Service
//
//                 Copyright 2013, Muhimbi Ltd
//                       www.muhimbi.com
//
//                     All rights reserved
//
//            Original Document author: jeroen.ritmeijer
//
//       Filename: TestFormSettings.cs
//          To do: -
//   Known issues: -
//        History: 23/01/2013 - JR - Initial version
//  ********************************************************
#endregion Copyright and file header

using System;
using System.Collections.Generic;
using System.Windows.Forms;

namespace TestHarness
{
    /// <summary>
    /// Simple config class that encapsulates the values filled out in the form.
    /// The main advantage is that all settings are retrieved in one go and,
    /// providing this is done on the form's main thread, this will make reading
    /// form data a lot simpler.
    /// </summary>
    class TestFormSettings
    {
        // ** Simple, thread safe, data types that represent the values filled out on the form
        public string textBoxFileName;
        public string textBoxPassword;
        public string comboBoxFormat;
        public string comboBoxQuality;
        public string textBoxStartPage;
        public string textBoxEndPage;
        public string comboBoxBookmarks;
        public string comboBoxPDFProfile;
        public string textBoxPDFOpenPassword;
        public string textBoxPDFOwnerPassword;
        public bool checkBoxDisableAnnotations;
        public bool checkBoxDisableAccessibility;
        public bool checkBoxDisableDocumentAssembly;
        public bool checkBoxDisableDocumentSecurity;
        public bool checkBoxDisableCopyContent;
        public bool checkBoxDisableFormFields;
        public bool checkBoxDisablePrint;
        public bool checkBoxDisableHighResolutionPrint;
        public bool checkBoxShowConverted;
        public string comboBoxMacroSecurityOptions;
        public bool checkBoxRefreshContent;
        public string comboBoxFidelity;
        public string comboBoxRange;
        public string textBoxServiceURL;
        public bool checkBoxIncludeSampleWatermarks;
        public string comboBoxPageOrientation;
        public string textBoxHTMLCode;
        public string textBoxHTMLurl;
        public string textBoxHTMLPassword;
        public string textBoxHTMLUserName;
        public string comboBoxHtmlRenderingEngine;
        public string comboBoxAuthenticationMode;
        public decimal numericUpDownConversionDelay;
        public Decimal parallelConversions;
        public bool checkBoxVerboseLogging;
        public bool checkBoxEmbedAllFonts;
        public bool checkBoxEnableFastWebView;
        public bool checkBoxPostProcessFile;
        public bool checkBoxSubsetFonts;
        public bool checkBoxCenterWindow;
        public bool checkBoxDisplayTitle;
        public bool checkBoxFitWindow;
        public bool checkBoxHideMenubar;
        public bool checkBoxHideToolbar;
        public bool checkBoxHideWindowUI;
        public bool checkBoxHideEmptyNavigationPane;
        public bool checkBoxFullScreen;
        public string comboBoxPageLayout;
        public string comboBoxNavigationPane;
        public string comboBoxPageScalingMode;
        public bool checkBoxPerformOCR;
        public string comboBoxOCRLanguage;
        public string comboBoxOCRPerformance;
        public bool checkBoxOCRPaginate;
        public string textBoxOCRWhiteList;
        public string textBoxOCRBlackList;
        public string textBoxOCRRegions;
        public bool checkBoxOCRRetrieveTextOnly;
        public int wcfMessageSize;
        public bool checkBoxEnableToC;
        public bool radioButtonToCFront;
        public string textBoxToCBookmarkLabel;
        public List<KeyValuePair<string,string>> dataGridViewToCProperties;
        public string textBoxToCTemplate;
        public string textBoxTemplateFile;
        public string textBoxTemplateDomain;
        public string textBoxTemplateUsername;
        public string textBoxTemplatePassword;
        public CheckState checkBoxGetDocPropertyiesIgnoreErros;

        /// <summary>
        /// Constructor that retrieves all the values from the form.
        /// Please create this object on the Form's main thread.
        /// </summary>
        /// <param name="testForm">Reference to the form to retrieve the data from.</param>
        public TestFormSettings(TestForm testForm)
        {
            textBoxFileName = testForm.textBoxFileName.Text;
            textBoxPassword = testForm.textBoxPassword.Text;
            comboBoxFormat = testForm.comboBoxFormat.Text;
            comboBoxQuality = testForm.comboBoxQuality.Text;
            textBoxStartPage = testForm.textBoxStartPage.Text;
            textBoxEndPage = testForm.textBoxEndPage.Text;
            comboBoxBookmarks = testForm.comboBoxBookmarks.Text;
            comboBoxPDFProfile = testForm.comboBoxPDFProfile.Text;
            textBoxPDFOpenPassword = testForm.textBoxPDFOpenPassword.Text;
            textBoxPDFOwnerPassword = testForm.textBoxPDFOwnerPassword.Text;
            checkBoxDisableAnnotations = testForm.checkBoxDisableAnnotations.Checked;
            checkBoxDisableAccessibility = testForm.checkBoxDisableAccessibility.Checked;
            checkBoxDisableDocumentAssembly = testForm.checkBoxDisableDocumentAssembly.Checked;
            checkBoxDisableDocumentSecurity = testForm.checkBoxDisableDocumentSecurity.Checked;
            checkBoxDisableCopyContent = testForm.checkBoxDisableCopyContent.Checked;
            checkBoxDisableFormFields = testForm.checkBoxDisableFormFields.Checked;
            checkBoxDisablePrint = testForm.checkBoxDisablePrint.Checked;
            checkBoxDisableHighResolutionPrint = testForm.checkBoxDisableHighResolutionPrint.Checked;
            checkBoxShowConverted = testForm.checkBoxShowConverted.Checked;
            comboBoxMacroSecurityOptions = testForm.comboBoxMacroSecurityOptions.Text;
            checkBoxRefreshContent = testForm.checkBoxRefreshContent.Checked;
            comboBoxFidelity = testForm.comboBoxFidelity.Text;
            comboBoxRange = testForm.comboBoxRange.Text;
            textBoxServiceURL = testForm.textBoxServiceURL.Text;
            checkBoxIncludeSampleWatermarks = testForm.checkBoxIncludeSampleWatermarks.Checked;
            comboBoxPageOrientation = testForm.comboBoxPageOrientation.Text;
            textBoxHTMLCode = testForm.textBoxHTMLCode.Text;
            textBoxHTMLurl = testForm.textBoxHTMLurl.Text;
            textBoxHTMLPassword = testForm.textBoxHTMLPassword.Text;
            textBoxHTMLUserName = testForm.textBoxHTMLUserName.Text;
            comboBoxHtmlRenderingEngine = testForm.comboBoxHtmlRenderingEngine.Text;
            comboBoxAuthenticationMode = testForm.comboBoxAuthenticationMode.Text;
            numericUpDownConversionDelay = testForm.numericUpDownConversionDelay.Value;
            parallelConversions = testForm.parallelConversions.Value;
            checkBoxVerboseLogging = testForm.checkBoxVerboseLogging.Checked;
            checkBoxEmbedAllFonts = testForm.checkBoxEmbedAllFonts.Checked;
            checkBoxEnableFastWebView = testForm.checkBoxEnableFastWebView.Checked;
            checkBoxPostProcessFile = testForm.checkBoxPostProcessFile.Checked;
            checkBoxSubsetFonts = testForm.checkBoxSubsetFonts.Checked;
            checkBoxCenterWindow = testForm.checkBoxCenterWindow.Checked;
            checkBoxDisplayTitle = testForm.checkBoxDisplayTitle.Checked;
            checkBoxFitWindow = testForm.checkBoxFitWindow.Checked;
            checkBoxHideMenubar = testForm.checkBoxHideMenubar.Checked;
            checkBoxHideToolbar = testForm.checkBoxHideToolbar.Checked;
            checkBoxHideWindowUI = testForm.checkBoxHideWindowUI.Checked;
            checkBoxHideEmptyNavigationPane = testForm.checkBoxHideEmptyNavigationPane.Checked;
            checkBoxFullScreen = testForm.checkBoxFullScreen.Checked;
            comboBoxPageLayout = testForm.comboBoxPageLayout.Text;
            comboBoxNavigationPane = testForm.comboBoxNavigationPane.Text;
            comboBoxPageScalingMode = testForm.comboBoxPageScalingMode.Text;
            checkBoxPerformOCR = testForm.checkBoxPerformOCR.Checked;
            comboBoxOCRLanguage = testForm.comboBoxOCRLanguage.Text;
            comboBoxOCRPerformance = (string)testForm.comboBoxOCRPerformance.SelectedItem;
            checkBoxOCRPaginate = testForm.checkBoxOCRPaginate.Checked;
            textBoxOCRWhiteList = testForm.textBoxOCRWhiteList.Text;
            textBoxOCRBlackList = testForm.textBoxOCRBlackList.Text;
            textBoxOCRRegions = testForm.textBoxOCRRegions.Text;
            checkBoxOCRRetrieveTextOnly = testForm.checkBoxOCRRetrieveTextOnly.Checked;
            wcfMessageSize = (int)testForm.numericUpDownWCFMessageSize.Value;
            checkBoxEnableToC = testForm.checkBoxEnableToC.Checked;
            radioButtonToCFront = testForm.radioButtonToCFront.Checked;
            textBoxToCBookmarkLabel = testForm.textBoxToCBookmarkLabel.Text;
            dataGridViewToCProperties = new List<KeyValuePair<string,string>>();
            foreach (DataGridViewRow row in testForm.dataGridViewToCProperties.Rows)
            {
                string key = (string)row.Cells[0].Value;
                if (!string.IsNullOrEmpty(key))
                {
                    string value = (string)row.Cells[1].Value;
                    dataGridViewToCProperties.Add(new KeyValuePair<string,string>(key, value));
                }
            }
            textBoxToCTemplate = testForm.textBoxToCTemplate.Text;

            textBoxTemplateFile = testForm.textBoxTemplateFile.Text == null ? null : testForm.textBoxTemplateFile.Text.Trim();
            textBoxTemplateUsername = testForm.textBoxTemplateUsername.Text == null ? null : testForm.textBoxTemplateUsername.Text.Trim();
            if (string.IsNullOrEmpty(textBoxTemplateUsername) == false && textBoxTemplateUsername.Contains("\\"))
            {
                string[] parts = textBoxTemplateUsername.Split(new char[] { '\\' }, StringSplitOptions.RemoveEmptyEntries);
                if (parts.Length > 0) 
                    textBoxTemplateDomain = parts[0] == null ? null : parts[0].Trim();
                if (parts.Length > 1) 
                    textBoxTemplateUsername = parts[1] == null ? null : parts[1].Trim();
            }
            textBoxTemplatePassword = testForm.textBoxTemplatePassword.Text == null ? null : testForm.textBoxTemplatePassword.Text.Trim();
            checkBoxGetDocPropertyiesIgnoreErros = testForm.checkBoxGetDocPropertyiesIgnoreErros.CheckState;
        }
    }
}
