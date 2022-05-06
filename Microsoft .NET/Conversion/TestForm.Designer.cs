namespace TestHarness
{
    partial class TestForm
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            this.components = new System.ComponentModel.Container();
            System.Windows.Forms.ToolTip toolTipOCR;
            System.ComponentModel.ComponentResourceManager resources = new System.ComponentModel.ComponentResourceManager(typeof(TestForm));
            System.Windows.Forms.DataGridViewCellStyle dataGridViewCellStyle4 = new System.Windows.Forms.DataGridViewCellStyle();
            System.Windows.Forms.DataGridViewCellStyle dataGridViewCellStyle5 = new System.Windows.Forms.DataGridViewCellStyle();
            System.Windows.Forms.DataGridViewCellStyle dataGridViewCellStyle6 = new System.Windows.Forms.DataGridViewCellStyle();
            this.textBoxOCRRegions = new System.Windows.Forms.TextBox();
            this.textBoxOCRBlackList = new System.Windows.Forms.TextBox();
            this.textBoxOCRWhiteList = new System.Windows.Forms.TextBox();
            this.buttonConvertFile = new System.Windows.Forms.Button();
            this.textBoxDebug = new System.Windows.Forms.TextBox();
            this.textBoxFileName = new System.Windows.Forms.TextBox();
            this.label1 = new System.Windows.Forms.Label();
            this.textBoxPassword = new System.Windows.Forms.TextBox();
            this.label2 = new System.Windows.Forms.Label();
            this.label3 = new System.Windows.Forms.Label();
            this.comboBoxFormat = new System.Windows.Forms.ComboBox();
            this.comboBoxQuality = new System.Windows.Forms.ComboBox();
            this.label4 = new System.Windows.Forms.Label();
            this.label6 = new System.Windows.Forms.Label();
            this.textBoxStartPage = new System.Windows.Forms.TextBox();
            this.textBoxEndPage = new System.Windows.Forms.TextBox();
            this.webBrowser = new System.Windows.Forms.WebBrowser();
            this.comboBoxBookmarks = new System.Windows.Forms.ComboBox();
            this.label5 = new System.Windows.Forms.Label();
            this.comboBoxPDFProfile = new System.Windows.Forms.ComboBox();
            this.label8 = new System.Windows.Forms.Label();
            this.textBoxPDFOpenPassword = new System.Windows.Forms.TextBox();
            this.textBoxPDFOwnerPassword = new System.Windows.Forms.TextBox();
            this.label9 = new System.Windows.Forms.Label();
            this.checkBoxDisableAnnotations = new System.Windows.Forms.CheckBox();
            this.checkBoxDisableAccessibility = new System.Windows.Forms.CheckBox();
            this.groupBox1 = new System.Windows.Forms.GroupBox();
            this.checkBoxDisableDocumentSecurity = new System.Windows.Forms.CheckBox();
            this.checkBoxDisableFormFields = new System.Windows.Forms.CheckBox();
            this.checkBoxDisableDocumentAssembly = new System.Windows.Forms.CheckBox();
            this.checkBoxDisablePrint = new System.Windows.Forms.CheckBox();
            this.checkBoxDisableHighResolutionPrint = new System.Windows.Forms.CheckBox();
            this.checkBoxDisableCopyContent = new System.Windows.Forms.CheckBox();
            this.buttonConvertFolder = new System.Windows.Forms.Button();
            this.labelThreadCount = new System.Windows.Forms.Label();
            this.checkBoxShowConverted = new System.Windows.Forms.CheckBox();
            this.comboBoxMacroSecurityOptions = new System.Windows.Forms.ComboBox();
            this.label10 = new System.Windows.Forms.Label();
            this.checkBoxRefreshContent = new System.Windows.Forms.CheckBox();
            this.comboBoxFidelity = new System.Windows.Forms.ComboBox();
            this.label11 = new System.Windows.Forms.Label();
            this.tabControl1 = new System.Windows.Forms.TabControl();
            this.tabPageConversion = new System.Windows.Forms.TabPage();
            this.buttonGetDocumentProperties = new System.Windows.Forms.Button();
            this.tabControl2 = new System.Windows.Forms.TabControl();
            this.tabPagePDFSecurity = new System.Windows.Forms.TabPage();
            this.tabPage1 = new System.Windows.Forms.TabPage();
            this.checkBoxPerformOCR = new System.Windows.Forms.CheckBox();
            this.groupBoxOCR = new System.Windows.Forms.GroupBox();
            this.checkBoxOCRRetrieveTextOnly = new System.Windows.Forms.CheckBox();
            this.label27 = new System.Windows.Forms.Label();
            this.label25 = new System.Windows.Forms.Label();
            this.label26 = new System.Windows.Forms.Label();
            this.comboBoxOCRLanguage = new System.Windows.Forms.ComboBox();
            this.label23 = new System.Windows.Forms.Label();
            this.checkBoxOCRPaginate = new System.Windows.Forms.CheckBox();
            this.comboBoxOCRPerformance = new System.Windows.Forms.ComboBox();
            this.label24 = new System.Windows.Forms.Label();
            this.tabPagePDFViewerPreferences = new System.Windows.Forms.TabPage();
            this.comboBoxPageScalingMode = new System.Windows.Forms.ComboBox();
            this.label22 = new System.Windows.Forms.Label();
            this.comboBoxNavigationPane = new System.Windows.Forms.ComboBox();
            this.label21 = new System.Windows.Forms.Label();
            this.comboBoxPageLayout = new System.Windows.Forms.ComboBox();
            this.label7 = new System.Windows.Forms.Label();
            this.checkBoxFullScreen = new System.Windows.Forms.CheckBox();
            this.checkBoxHideEmptyNavigationPane = new System.Windows.Forms.CheckBox();
            this.checkBoxHideWindowUI = new System.Windows.Forms.CheckBox();
            this.checkBoxHideToolbar = new System.Windows.Forms.CheckBox();
            this.checkBoxHideMenubar = new System.Windows.Forms.CheckBox();
            this.checkBoxFitWindow = new System.Windows.Forms.CheckBox();
            this.checkBoxDisplayTitle = new System.Windows.Forms.CheckBox();
            this.checkBoxCenterWindow = new System.Windows.Forms.CheckBox();
            this.tabPagePDFPostProcessing = new System.Windows.Forms.TabPage();
            this.checkBoxPostProcessFile = new System.Windows.Forms.CheckBox();
            this.groupBoxPostProcess = new System.Windows.Forms.GroupBox();
            this.checkBoxSubsetFonts = new System.Windows.Forms.CheckBox();
            this.checkBoxEmbedAllFonts = new System.Windows.Forms.CheckBox();
            this.checkBoxEnableFastWebView = new System.Windows.Forms.CheckBox();
            this.checkBoxIncludeSampleWatermarks = new System.Windows.Forms.CheckBox();
            this.tabPageMiscellaneous = new System.Windows.Forms.TabPage();
            this.label42 = new System.Windows.Forms.Label();
            this.buttonBrowseTemplate = new System.Windows.Forms.Button();
            this.textBoxTemplatePassword = new System.Windows.Forms.TextBox();
            this.textBoxTemplateUsername = new System.Windows.Forms.TextBox();
            this.textBoxTemplateFile = new System.Windows.Forms.TextBox();
            this.comboBoxPageOrientation = new System.Windows.Forms.ComboBox();
            this.label14 = new System.Windows.Forms.Label();
            this.comboBoxRange = new System.Windows.Forms.ComboBox();
            this.label41 = new System.Windows.Forms.Label();
            this.label40 = new System.Windows.Forms.Label();
            this.label39 = new System.Windows.Forms.Label();
            this.label12 = new System.Windows.Forms.Label();
            this.tabPageDocumentInformation = new System.Windows.Forms.TabPage();
            this.checkBoxGetDocPropertyiesIgnoreErros = new System.Windows.Forms.CheckBox();
            this.buttonAddDocProperty = new System.Windows.Forms.Button();
            this.dataGridViewDocumentPropertySettings = new System.Windows.Forms.DataGridView();
            this.buttonBrowse = new System.Windows.Forms.Button();
            this.buttonMergeFolder = new System.Windows.Forms.Button();
            this.tabPageHTML = new System.Windows.Forms.TabPage();
            this.numericUpDownConversionDelay = new System.Windows.Forms.NumericUpDown();
            this.comboBoxAuthenticationMode = new System.Windows.Forms.ComboBox();
            this.comboBoxHtmlRenderingEngine = new System.Windows.Forms.ComboBox();
            this.groupBox3 = new System.Windows.Forms.GroupBox();
            this.textBoxHTMLurl = new System.Windows.Forms.TextBox();
            this.buttonConvertURL = new System.Windows.Forms.Button();
            this.groupBox2 = new System.Windows.Forms.GroupBox();
            this.textBoxHTMLCode = new System.Windows.Forms.TextBox();
            this.buttonConvertHTML = new System.Windows.Forms.Button();
            this.textBoxHTMLUserName = new System.Windows.Forms.TextBox();
            this.comboBoxMediaType = new System.Windows.Forms.ComboBox();
            this.label35 = new System.Windows.Forms.Label();
            this.textBoxHTMLPassword = new System.Windows.Forms.TextBox();
            this.label33 = new System.Windows.Forms.Label();
            this.label34 = new System.Windows.Forms.Label();
            this.label17 = new System.Windows.Forms.Label();
            this.label18 = new System.Windows.Forms.Label();
            this.label16 = new System.Windows.Forms.Label();
            this.label15 = new System.Windows.Forms.Label();
            this.tabPageToC = new System.Windows.Forms.TabPage();
            this.checkBoxEnableToC = new System.Windows.Forms.CheckBox();
            this.tocGroupBox = new System.Windows.Forms.GroupBox();
            this.panel1 = new System.Windows.Forms.Panel();
            this.textBoxToCTemplate = new System.Windows.Forms.TextBox();
            this.panel5 = new System.Windows.Forms.Panel();
            this.label29 = new System.Windows.Forms.Label();
            this.buttonLoadTocTemplate = new System.Windows.Forms.Button();
            this.panel6 = new System.Windows.Forms.Panel();
            this.panel3 = new System.Windows.Forms.Panel();
            this.panel9 = new System.Windows.Forms.Panel();
            this.dataGridViewToCProperties = new System.Windows.Forms.DataGridView();
            this.name = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.value = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.label32 = new System.Windows.Forms.Label();
            this.panel8 = new System.Windows.Forms.Panel();
            this.textBoxToCBookmarkLabel = new System.Windows.Forms.TextBox();
            this.label31 = new System.Windows.Forms.Label();
            this.panel4 = new System.Windows.Forms.Panel();
            this.radioButtonToCBack = new System.Windows.Forms.RadioButton();
            this.radioButtonToCFront = new System.Windows.Forms.RadioButton();
            this.label30 = new System.Windows.Forms.Label();
            this.panel2 = new System.Windows.Forms.Panel();
            this.tabPageConfigure = new System.Windows.Forms.TabPage();
            this.label38 = new System.Windows.Forms.Label();
            this.label37 = new System.Windows.Forms.Label();
            this.textBoxWCFPassword = new System.Windows.Forms.TextBox();
            this.textBoxWCFUsername = new System.Windows.Forms.TextBox();
            this.label36 = new System.Windows.Forms.Label();
            this.numericUpDownWCFMessageSize = new System.Windows.Forms.NumericUpDown();
            this.label28 = new System.Windows.Forms.Label();
            this.checkBoxVerboseLogging = new System.Windows.Forms.CheckBox();
            this.label20 = new System.Windows.Forms.Label();
            this.parallelConversions = new System.Windows.Forms.NumericUpDown();
            this.label19 = new System.Windows.Forms.Label();
            this.label13 = new System.Windows.Forms.Label();
            this.textBoxServiceURL = new System.Windows.Forms.TextBox();
            this.buttonRequestConfiguration = new System.Windows.Forms.Button();
            this.tabPageDiagnose = new System.Windows.Forms.TabPage();
            this.buttonRequestStatus = new System.Windows.Forms.Button();
            this.buttonRequestDiagnostics = new System.Windows.Forms.Button();
            this.openFileDialog = new System.Windows.Forms.OpenFileDialog();
            this.linkLabel = new System.Windows.Forms.LinkLabel();
            this.linkLabelHowToUse = new System.Windows.Forms.LinkLabel();
            this.openFileDialogTemplate = new System.Windows.Forms.OpenFileDialog();
            toolTipOCR = new System.Windows.Forms.ToolTip(this.components);
            this.groupBox1.SuspendLayout();
            this.tabControl1.SuspendLayout();
            this.tabPageConversion.SuspendLayout();
            this.tabControl2.SuspendLayout();
            this.tabPagePDFSecurity.SuspendLayout();
            this.tabPage1.SuspendLayout();
            this.groupBoxOCR.SuspendLayout();
            this.tabPagePDFViewerPreferences.SuspendLayout();
            this.tabPagePDFPostProcessing.SuspendLayout();
            this.groupBoxPostProcess.SuspendLayout();
            this.tabPageMiscellaneous.SuspendLayout();
            this.tabPageDocumentInformation.SuspendLayout();
            ((System.ComponentModel.ISupportInitialize)(this.dataGridViewDocumentPropertySettings)).BeginInit();
            this.tabPageHTML.SuspendLayout();
            ((System.ComponentModel.ISupportInitialize)(this.numericUpDownConversionDelay)).BeginInit();
            this.groupBox3.SuspendLayout();
            this.groupBox2.SuspendLayout();
            this.tabPageToC.SuspendLayout();
            this.tocGroupBox.SuspendLayout();
            this.panel1.SuspendLayout();
            this.panel5.SuspendLayout();
            this.panel3.SuspendLayout();
            this.panel9.SuspendLayout();
            ((System.ComponentModel.ISupportInitialize)(this.dataGridViewToCProperties)).BeginInit();
            this.panel8.SuspendLayout();
            this.panel4.SuspendLayout();
            this.tabPageConfigure.SuspendLayout();
            ((System.ComponentModel.ISupportInitialize)(this.numericUpDownWCFMessageSize)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.parallelConversions)).BeginInit();
            this.tabPageDiagnose.SuspendLayout();
            this.SuspendLayout();
            // 
            // toolTipOCR
            // 
            toolTipOCR.AutoPopDelay = 15000;
            toolTipOCR.InitialDelay = 500;
            toolTipOCR.IsBalloon = true;
            toolTipOCR.ReshowDelay = 100;
            toolTipOCR.ToolTipIcon = System.Windows.Forms.ToolTipIcon.Info;
            toolTipOCR.ToolTipTitle = "Optional OCR Settings";
            // 
            // textBoxOCRRegions
            // 
            this.textBoxOCRRegions.Location = new System.Drawing.Point(226, 50);
            this.textBoxOCRRegions.Multiline = true;
            this.textBoxOCRRegions.Name = "textBoxOCRRegions";
            this.textBoxOCRRegions.ScrollBars = System.Windows.Forms.ScrollBars.Vertical;
            this.textBoxOCRRegions.Size = new System.Drawing.Size(285, 46);
            this.textBoxOCRRegions.TabIndex = 10;
            toolTipOCR.SetToolTip(this.textBoxOCRRegions, "Specify one or more optional OCR regions using the format \r\n\"id|x|y|w|h|pageRegio" +
        "n|startPage|endPage|pageInterval\" \r\nwhere x,y,w and h are mandatory and the rest" +
        " is optional.");
            // 
            // textBoxOCRBlackList
            // 
            this.textBoxOCRBlackList.Location = new System.Drawing.Point(226, 23);
            this.textBoxOCRBlackList.Name = "textBoxOCRBlackList";
            this.textBoxOCRBlackList.Size = new System.Drawing.Size(110, 20);
            this.textBoxOCRBlackList.TabIndex = 7;
            toolTipOCR.SetToolTip(this.textBoxOCRBlackList, resources.GetString("textBoxOCRBlackList.ToolTip"));
            // 
            // textBoxOCRWhiteList
            // 
            this.textBoxOCRWhiteList.Location = new System.Drawing.Point(401, 23);
            this.textBoxOCRWhiteList.Name = "textBoxOCRWhiteList";
            this.textBoxOCRWhiteList.Size = new System.Drawing.Size(110, 20);
            this.textBoxOCRWhiteList.TabIndex = 8;
            toolTipOCR.SetToolTip(this.textBoxOCRWhiteList, resources.GetString("textBoxOCRWhiteList.ToolTip"));
            // 
            // buttonConvertFile
            // 
            this.buttonConvertFile.Location = new System.Drawing.Point(6, 189);
            this.buttonConvertFile.Name = "buttonConvertFile";
            this.buttonConvertFile.Size = new System.Drawing.Size(140, 23);
            this.buttonConvertFile.TabIndex = 15;
            this.buttonConvertFile.Text = "Convert / Process File";
            this.buttonConvertFile.UseVisualStyleBackColor = true;
            this.buttonConvertFile.Click += new System.EventHandler(this.buttonConvertFile_Click);
            // 
            // textBoxDebug
            // 
            this.textBoxDebug.Anchor = ((System.Windows.Forms.AnchorStyles)(((System.Windows.Forms.AnchorStyles.Top | System.Windows.Forms.AnchorStyles.Bottom) 
            | System.Windows.Forms.AnchorStyles.Left)));
            this.textBoxDebug.Location = new System.Drawing.Point(12, 261);
            this.textBoxDebug.Multiline = true;
            this.textBoxDebug.Name = "textBoxDebug";
            this.textBoxDebug.ScrollBars = System.Windows.Forms.ScrollBars.Vertical;
            this.textBoxDebug.Size = new System.Drawing.Size(567, 329);
            this.textBoxDebug.TabIndex = 18;
            this.textBoxDebug.Text = resources.GetString("textBoxDebug.Text");
            // 
            // textBoxFileName
            // 
            this.textBoxFileName.Location = new System.Drawing.Point(50, 8);
            this.textBoxFileName.Name = "textBoxFileName";
            this.textBoxFileName.Size = new System.Drawing.Size(181, 20);
            this.textBoxFileName.TabIndex = 1;
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Location = new System.Drawing.Point(271, 11);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(82, 13);
            this.label1.TabIndex = 3;
            this.label1.Text = "Open Password";
            // 
            // textBoxPassword
            // 
            this.textBoxPassword.Location = new System.Drawing.Point(359, 8);
            this.textBoxPassword.Name = "textBoxPassword";
            this.textBoxPassword.Size = new System.Drawing.Size(84, 20);
            this.textBoxPassword.TabIndex = 3;
            // 
            // label2
            // 
            this.label2.AutoSize = true;
            this.label2.Location = new System.Drawing.Point(7, 11);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(41, 13);
            this.label2.TabIndex = 1;
            this.label2.Text = "Source";
            // 
            // label3
            // 
            this.label3.AutoSize = true;
            this.label3.Location = new System.Drawing.Point(451, 11);
            this.label3.Name = "label3";
            this.label3.Size = new System.Drawing.Size(39, 13);
            this.label3.TabIndex = 3;
            this.label3.Text = "Output";
            // 
            // comboBoxFormat
            // 
            this.comboBoxFormat.FormattingEnabled = true;
            this.comboBoxFormat.Items.AddRange(new object[] {
            "PDF",
            "BMP",
            "CSV",
            "DOC",
            "DOCX",
            "EPS",
            "GIF",
            "HTML",
            "JPG",
            "MHT",
            "ODP",
            "ODS",
            "ODT",
            "PCL",
            "PNG",
            "PPS",
            "PPSX",
            "PPT",
            "PPTX",
            "PS",
            "RTF",
            "TIFF",
            "TXT",
            "XLS",
            "XLSX",
            "XML",
            "XPS"});
            this.comboBoxFormat.Location = new System.Drawing.Point(492, 7);
            this.comboBoxFormat.Name = "comboBoxFormat";
            this.comboBoxFormat.Size = new System.Drawing.Size(55, 21);
            this.comboBoxFormat.TabIndex = 4;
            this.comboBoxFormat.Text = "PDF";
            // 
            // comboBoxQuality
            // 
            this.comboBoxQuality.FormattingEnabled = true;
            this.comboBoxQuality.Items.AddRange(new object[] {
            "OptimizeForPrint",
            "OptimizeForOnScreen",
            "Original"});
            this.comboBoxQuality.Location = new System.Drawing.Point(49, 11);
            this.comboBoxQuality.Name = "comboBoxQuality";
            this.comboBoxQuality.Size = new System.Drawing.Size(102, 21);
            this.comboBoxQuality.TabIndex = 1;
            this.comboBoxQuality.Text = "OptimizeForPrint";
            // 
            // label4
            // 
            this.label4.AutoSize = true;
            this.label4.Location = new System.Drawing.Point(8, 15);
            this.label4.Name = "label4";
            this.label4.Size = new System.Drawing.Size(39, 13);
            this.label4.TabIndex = 7;
            this.label4.Text = "Quality";
            // 
            // label6
            // 
            this.label6.AutoSize = true;
            this.label6.Location = new System.Drawing.Point(186, 15);
            this.label6.Name = "label6";
            this.label6.Size = new System.Drawing.Size(37, 13);
            this.label6.TabIndex = 9;
            this.label6.Text = "Pages";
            // 
            // textBoxStartPage
            // 
            this.textBoxStartPage.Location = new System.Drawing.Point(232, 11);
            this.textBoxStartPage.Name = "textBoxStartPage";
            this.textBoxStartPage.Size = new System.Drawing.Size(22, 20);
            this.textBoxStartPage.TabIndex = 2;
            this.textBoxStartPage.Text = "0";
            // 
            // textBoxEndPage
            // 
            this.textBoxEndPage.Location = new System.Drawing.Point(264, 11);
            this.textBoxEndPage.Name = "textBoxEndPage";
            this.textBoxEndPage.Size = new System.Drawing.Size(22, 20);
            this.textBoxEndPage.TabIndex = 3;
            this.textBoxEndPage.Text = "0";
            // 
            // webBrowser
            // 
            this.webBrowser.Anchor = ((System.Windows.Forms.AnchorStyles)((((System.Windows.Forms.AnchorStyles.Top | System.Windows.Forms.AnchorStyles.Bottom) 
            | System.Windows.Forms.AnchorStyles.Left) 
            | System.Windows.Forms.AnchorStyles.Right)));
            this.webBrowser.Location = new System.Drawing.Point(585, 12);
            this.webBrowser.MinimumSize = new System.Drawing.Size(20, 20);
            this.webBrowser.Name = "webBrowser";
            this.webBrowser.Size = new System.Drawing.Size(437, 597);
            this.webBrowser.TabIndex = 11;
            // 
            // comboBoxBookmarks
            // 
            this.comboBoxBookmarks.FormattingEnabled = true;
            this.comboBoxBookmarks.Items.AddRange(new object[] {
            "Disabled",
            "Automatic",
            "Custom"});
            this.comboBoxBookmarks.Location = new System.Drawing.Point(67, 8);
            this.comboBoxBookmarks.Name = "comboBoxBookmarks";
            this.comboBoxBookmarks.Size = new System.Drawing.Size(102, 21);
            this.comboBoxBookmarks.TabIndex = 1;
            this.comboBoxBookmarks.Text = "Automatic";
            // 
            // label5
            // 
            this.label5.AutoSize = true;
            this.label5.Location = new System.Drawing.Point(7, 12);
            this.label5.Name = "label5";
            this.label5.Size = new System.Drawing.Size(60, 13);
            this.label5.TabIndex = 12;
            this.label5.Text = "Bookmarks";
            // 
            // comboBoxPDFProfile
            // 
            this.comboBoxPDFProfile.FormattingEnabled = true;
            this.comboBoxPDFProfile.Location = new System.Drawing.Point(11, 24);
            this.comboBoxPDFProfile.Name = "comboBoxPDFProfile";
            this.comboBoxPDFProfile.Size = new System.Drawing.Size(74, 21);
            this.comboBoxPDFProfile.TabIndex = 6;
            this.comboBoxPDFProfile.Text = "Default";
            // 
            // label8
            // 
            this.label8.AutoSize = true;
            this.label8.Location = new System.Drawing.Point(6, 15);
            this.label8.Name = "label8";
            this.label8.Size = new System.Drawing.Size(82, 13);
            this.label8.TabIndex = 0;
            this.label8.Text = "Open Password";
            // 
            // textBoxPDFOpenPassword
            // 
            this.textBoxPDFOpenPassword.Location = new System.Drawing.Point(90, 12);
            this.textBoxPDFOpenPassword.Name = "textBoxPDFOpenPassword";
            this.textBoxPDFOpenPassword.Size = new System.Drawing.Size(160, 20);
            this.textBoxPDFOpenPassword.TabIndex = 6;
            // 
            // textBoxPDFOwnerPassword
            // 
            this.textBoxPDFOwnerPassword.Location = new System.Drawing.Point(371, 12);
            this.textBoxPDFOwnerPassword.Name = "textBoxPDFOwnerPassword";
            this.textBoxPDFOwnerPassword.Size = new System.Drawing.Size(160, 20);
            this.textBoxPDFOwnerPassword.TabIndex = 7;
            // 
            // label9
            // 
            this.label9.AutoSize = true;
            this.label9.Location = new System.Drawing.Point(278, 15);
            this.label9.Name = "label9";
            this.label9.Size = new System.Drawing.Size(87, 13);
            this.label9.TabIndex = 1;
            this.label9.Text = "Owner Password";
            // 
            // checkBoxDisableAnnotations
            // 
            this.checkBoxDisableAnnotations.AutoSize = true;
            this.checkBoxDisableAnnotations.Location = new System.Drawing.Point(14, 19);
            this.checkBoxDisableAnnotations.Name = "checkBoxDisableAnnotations";
            this.checkBoxDisableAnnotations.Size = new System.Drawing.Size(82, 17);
            this.checkBoxDisableAnnotations.TabIndex = 8;
            this.checkBoxDisableAnnotations.Text = "Annotations";
            this.checkBoxDisableAnnotations.UseVisualStyleBackColor = true;
            // 
            // checkBoxDisableAccessibility
            // 
            this.checkBoxDisableAccessibility.AutoSize = true;
            this.checkBoxDisableAccessibility.Location = new System.Drawing.Point(145, 19);
            this.checkBoxDisableAccessibility.Name = "checkBoxDisableAccessibility";
            this.checkBoxDisableAccessibility.Size = new System.Drawing.Size(83, 17);
            this.checkBoxDisableAccessibility.TabIndex = 9;
            this.checkBoxDisableAccessibility.Text = "Accessibility";
            this.checkBoxDisableAccessibility.UseVisualStyleBackColor = true;
            // 
            // groupBox1
            // 
            this.groupBox1.Controls.Add(this.checkBoxDisableDocumentSecurity);
            this.groupBox1.Controls.Add(this.checkBoxDisableFormFields);
            this.groupBox1.Controls.Add(this.checkBoxDisableAnnotations);
            this.groupBox1.Controls.Add(this.checkBoxDisableDocumentAssembly);
            this.groupBox1.Controls.Add(this.checkBoxDisablePrint);
            this.groupBox1.Controls.Add(this.checkBoxDisableHighResolutionPrint);
            this.groupBox1.Controls.Add(this.checkBoxDisableCopyContent);
            this.groupBox1.Controls.Add(this.checkBoxDisableAccessibility);
            this.groupBox1.Location = new System.Drawing.Point(9, 41);
            this.groupBox1.Name = "groupBox1";
            this.groupBox1.Size = new System.Drawing.Size(522, 64);
            this.groupBox1.TabIndex = 20;
            this.groupBox1.TabStop = false;
            this.groupBox1.Text = "Disable";
            // 
            // checkBoxDisableDocumentSecurity
            // 
            this.checkBoxDisableDocumentSecurity.AutoSize = true;
            this.checkBoxDisableDocumentSecurity.ForeColor = System.Drawing.Color.Red;
            this.checkBoxDisableDocumentSecurity.Location = new System.Drawing.Point(394, 40);
            this.checkBoxDisableDocumentSecurity.Name = "checkBoxDisableDocumentSecurity";
            this.checkBoxDisableDocumentSecurity.Size = new System.Drawing.Size(102, 17);
            this.checkBoxDisableDocumentSecurity.TabIndex = 15;
            this.checkBoxDisableDocumentSecurity.Text = "Disable Security";
            this.checkBoxDisableDocumentSecurity.UseVisualStyleBackColor = true;
            this.checkBoxDisableDocumentSecurity.CheckedChanged += new System.EventHandler(this.checkBoxDisableDocumentSecurity_CheckedChanged);
            // 
            // checkBoxDisableFormFields
            // 
            this.checkBoxDisableFormFields.AutoSize = true;
            this.checkBoxDisableFormFields.Location = new System.Drawing.Point(14, 40);
            this.checkBoxDisableFormFields.Name = "checkBoxDisableFormFields";
            this.checkBoxDisableFormFields.Size = new System.Drawing.Size(79, 17);
            this.checkBoxDisableFormFields.TabIndex = 12;
            this.checkBoxDisableFormFields.Text = "Form Fields";
            this.checkBoxDisableFormFields.UseVisualStyleBackColor = true;
            // 
            // checkBoxDisableDocumentAssembly
            // 
            this.checkBoxDisableDocumentAssembly.AutoSize = true;
            this.checkBoxDisableDocumentAssembly.Location = new System.Drawing.Point(394, 19);
            this.checkBoxDisableDocumentAssembly.Name = "checkBoxDisableDocumentAssembly";
            this.checkBoxDisableDocumentAssembly.Size = new System.Drawing.Size(122, 17);
            this.checkBoxDisableDocumentAssembly.TabIndex = 11;
            this.checkBoxDisableDocumentAssembly.Text = "Document Assembly";
            this.checkBoxDisableDocumentAssembly.UseVisualStyleBackColor = true;
            // 
            // checkBoxDisablePrint
            // 
            this.checkBoxDisablePrint.AutoSize = true;
            this.checkBoxDisablePrint.Location = new System.Drawing.Point(277, 40);
            this.checkBoxDisablePrint.Name = "checkBoxDisablePrint";
            this.checkBoxDisablePrint.Size = new System.Drawing.Size(47, 17);
            this.checkBoxDisablePrint.TabIndex = 14;
            this.checkBoxDisablePrint.Text = "Print";
            this.checkBoxDisablePrint.UseVisualStyleBackColor = true;
            // 
            // checkBoxDisableHighResolutionPrint
            // 
            this.checkBoxDisableHighResolutionPrint.AutoSize = true;
            this.checkBoxDisableHighResolutionPrint.Location = new System.Drawing.Point(145, 40);
            this.checkBoxDisableHighResolutionPrint.Name = "checkBoxDisableHighResolutionPrint";
            this.checkBoxDisableHighResolutionPrint.Size = new System.Drawing.Size(125, 17);
            this.checkBoxDisableHighResolutionPrint.TabIndex = 13;
            this.checkBoxDisableHighResolutionPrint.Text = "High Resolution Print";
            this.checkBoxDisableHighResolutionPrint.UseVisualStyleBackColor = true;
            // 
            // checkBoxDisableCopyContent
            // 
            this.checkBoxDisableCopyContent.AutoSize = true;
            this.checkBoxDisableCopyContent.Location = new System.Drawing.Point(277, 19);
            this.checkBoxDisableCopyContent.Name = "checkBoxDisableCopyContent";
            this.checkBoxDisableCopyContent.Size = new System.Drawing.Size(90, 17);
            this.checkBoxDisableCopyContent.TabIndex = 10;
            this.checkBoxDisableCopyContent.Text = "Copy Content";
            this.checkBoxDisableCopyContent.UseVisualStyleBackColor = true;
            // 
            // buttonConvertFolder
            // 
            this.buttonConvertFolder.Location = new System.Drawing.Point(148, 189);
            this.buttonConvertFolder.Name = "buttonConvertFolder";
            this.buttonConvertFolder.Size = new System.Drawing.Size(140, 23);
            this.buttonConvertFolder.TabIndex = 16;
            this.buttonConvertFolder.Text = "Convert / Process Folder";
            this.buttonConvertFolder.UseVisualStyleBackColor = true;
            this.buttonConvertFolder.Click += new System.EventHandler(this.buttonConvertFolder_Click);
            // 
            // labelThreadCount
            // 
            this.labelThreadCount.Anchor = ((System.Windows.Forms.AnchorStyles)((System.Windows.Forms.AnchorStyles.Bottom | System.Windows.Forms.AnchorStyles.Left)));
            this.labelThreadCount.AutoSize = true;
            this.labelThreadCount.Location = new System.Drawing.Point(504, 599);
            this.labelThreadCount.Name = "labelThreadCount";
            this.labelThreadCount.Size = new System.Drawing.Size(72, 13);
            this.labelThreadCount.TabIndex = 21;
            this.labelThreadCount.Text = "In Progress: 0";
            this.labelThreadCount.TextAlign = System.Drawing.ContentAlignment.MiddleRight;
            // 
            // checkBoxShowConverted
            // 
            this.checkBoxShowConverted.Anchor = ((System.Windows.Forms.AnchorStyles)((System.Windows.Forms.AnchorStyles.Bottom | System.Windows.Forms.AnchorStyles.Left)));
            this.checkBoxShowConverted.AutoSize = true;
            this.checkBoxShowConverted.Checked = true;
            this.checkBoxShowConverted.CheckState = System.Windows.Forms.CheckState.Checked;
            this.checkBoxShowConverted.Location = new System.Drawing.Point(12, 597);
            this.checkBoxShowConverted.Name = "checkBoxShowConverted";
            this.checkBoxShowConverted.Size = new System.Drawing.Size(120, 17);
            this.checkBoxShowConverted.TabIndex = 19;
            this.checkBoxShowConverted.Text = "Show converted file";
            this.checkBoxShowConverted.UseVisualStyleBackColor = true;
            // 
            // comboBoxMacroSecurityOptions
            // 
            this.comboBoxMacroSecurityOptions.FormattingEnabled = true;
            this.comboBoxMacroSecurityOptions.Items.AddRange(new object[] {
            "None",
            "SignedOnly",
            "All"});
            this.comboBoxMacroSecurityOptions.Location = new System.Drawing.Point(233, 8);
            this.comboBoxMacroSecurityOptions.Name = "comboBoxMacroSecurityOptions";
            this.comboBoxMacroSecurityOptions.Size = new System.Drawing.Size(102, 21);
            this.comboBoxMacroSecurityOptions.TabIndex = 2;
            this.comboBoxMacroSecurityOptions.Text = "None";
            // 
            // label10
            // 
            this.label10.AutoSize = true;
            this.label10.Location = new System.Drawing.Point(189, 12);
            this.label10.Name = "label10";
            this.label10.Size = new System.Drawing.Size(42, 13);
            this.label10.TabIndex = 22;
            this.label10.Text = "Macros";
            // 
            // checkBoxRefreshContent
            // 
            this.checkBoxRefreshContent.AutoSize = true;
            this.checkBoxRefreshContent.Location = new System.Drawing.Point(361, 35);
            this.checkBoxRefreshContent.Name = "checkBoxRefreshContent";
            this.checkBoxRefreshContent.Size = new System.Drawing.Size(151, 17);
            this.checkBoxRefreshContent.TabIndex = 6;
            this.checkBoxRefreshContent.Text = "Refresh before conversion";
            this.checkBoxRefreshContent.UseVisualStyleBackColor = true;
            // 
            // comboBoxFidelity
            // 
            this.comboBoxFidelity.FormattingEnabled = true;
            this.comboBoxFidelity.Items.AddRange(new object[] {
            "High",
            "Full"});
            this.comboBoxFidelity.Location = new System.Drawing.Point(233, 35);
            this.comboBoxFidelity.Name = "comboBoxFidelity";
            this.comboBoxFidelity.Size = new System.Drawing.Size(102, 21);
            this.comboBoxFidelity.TabIndex = 5;
            this.comboBoxFidelity.Text = "Full";
            // 
            // label11
            // 
            this.label11.AutoSize = true;
            this.label11.Location = new System.Drawing.Point(193, 39);
            this.label11.Name = "label11";
            this.label11.Size = new System.Drawing.Size(39, 13);
            this.label11.TabIndex = 24;
            this.label11.Text = "Fidelity";
            // 
            // tabControl1
            // 
            this.tabControl1.Controls.Add(this.tabPageConversion);
            this.tabControl1.Controls.Add(this.tabPageHTML);
            this.tabControl1.Controls.Add(this.tabPageToC);
            this.tabControl1.Controls.Add(this.tabPageConfigure);
            this.tabControl1.Controls.Add(this.tabPageDiagnose);
            this.tabControl1.Location = new System.Drawing.Point(12, 12);
            this.tabControl1.Multiline = true;
            this.tabControl1.Name = "tabControl1";
            this.tabControl1.SelectedIndex = 0;
            this.tabControl1.Size = new System.Drawing.Size(565, 243);
            this.tabControl1.TabIndex = 26;
            // 
            // tabPageConversion
            // 
            this.tabPageConversion.Controls.Add(this.buttonGetDocumentProperties);
            this.tabPageConversion.Controls.Add(this.tabControl2);
            this.tabPageConversion.Controls.Add(this.buttonBrowse);
            this.tabPageConversion.Controls.Add(this.buttonConvertFile);
            this.tabPageConversion.Controls.Add(this.buttonMergeFolder);
            this.tabPageConversion.Controls.Add(this.buttonConvertFolder);
            this.tabPageConversion.Controls.Add(this.textBoxFileName);
            this.tabPageConversion.Controls.Add(this.label1);
            this.tabPageConversion.Controls.Add(this.label3);
            this.tabPageConversion.Controls.Add(this.textBoxPassword);
            this.tabPageConversion.Controls.Add(this.label2);
            this.tabPageConversion.Controls.Add(this.comboBoxFormat);
            this.tabPageConversion.Location = new System.Drawing.Point(4, 22);
            this.tabPageConversion.Name = "tabPageConversion";
            this.tabPageConversion.Padding = new System.Windows.Forms.Padding(3);
            this.tabPageConversion.Size = new System.Drawing.Size(557, 217);
            this.tabPageConversion.TabIndex = 0;
            this.tabPageConversion.Text = "WS Convert";
            this.tabPageConversion.UseVisualStyleBackColor = true;
            // 
            // buttonGetDocumentProperties
            // 
            this.buttonGetDocumentProperties.Location = new System.Drawing.Point(432, 189);
            this.buttonGetDocumentProperties.Name = "buttonGetDocumentProperties";
            this.buttonGetDocumentProperties.Size = new System.Drawing.Size(119, 23);
            this.buttonGetDocumentProperties.TabIndex = 18;
            this.buttonGetDocumentProperties.Text = "Document Info";
            this.buttonGetDocumentProperties.UseVisualStyleBackColor = true;
            this.buttonGetDocumentProperties.Click += new System.EventHandler(this.buttonGetDocumentProperties_Click);
            // 
            // tabControl2
            // 
            this.tabControl2.Controls.Add(this.tabPagePDFSecurity);
            this.tabControl2.Controls.Add(this.tabPage1);
            this.tabControl2.Controls.Add(this.tabPagePDFViewerPreferences);
            this.tabControl2.Controls.Add(this.tabPagePDFPostProcessing);
            this.tabControl2.Controls.Add(this.tabPageMiscellaneous);
            this.tabControl2.Controls.Add(this.tabPageDocumentInformation);
            this.tabControl2.Location = new System.Drawing.Point(6, 35);
            this.tabControl2.Name = "tabControl2";
            this.tabControl2.SelectedIndex = 0;
            this.tabControl2.Size = new System.Drawing.Size(545, 148);
            this.tabControl2.TabIndex = 5;
            // 
            // tabPagePDFSecurity
            // 
            this.tabPagePDFSecurity.Controls.Add(this.groupBox1);
            this.tabPagePDFSecurity.Controls.Add(this.label8);
            this.tabPagePDFSecurity.Controls.Add(this.label9);
            this.tabPagePDFSecurity.Controls.Add(this.textBoxPDFOwnerPassword);
            this.tabPagePDFSecurity.Controls.Add(this.textBoxPDFOpenPassword);
            this.tabPagePDFSecurity.Location = new System.Drawing.Point(4, 22);
            this.tabPagePDFSecurity.Name = "tabPagePDFSecurity";
            this.tabPagePDFSecurity.Padding = new System.Windows.Forms.Padding(3);
            this.tabPagePDFSecurity.Size = new System.Drawing.Size(537, 122);
            this.tabPagePDFSecurity.TabIndex = 0;
            this.tabPagePDFSecurity.Text = "PDF Security";
            this.tabPagePDFSecurity.UseVisualStyleBackColor = true;
            // 
            // tabPage1
            // 
            this.tabPage1.Controls.Add(this.checkBoxPerformOCR);
            this.tabPage1.Controls.Add(this.groupBoxOCR);
            this.tabPage1.Location = new System.Drawing.Point(4, 22);
            this.tabPage1.Name = "tabPage1";
            this.tabPage1.Size = new System.Drawing.Size(537, 122);
            this.tabPage1.TabIndex = 4;
            this.tabPage1.Text = "OCR Settings";
            this.tabPage1.UseVisualStyleBackColor = true;
            // 
            // checkBoxPerformOCR
            // 
            this.checkBoxPerformOCR.AutoSize = true;
            this.checkBoxPerformOCR.Location = new System.Drawing.Point(16, 6);
            this.checkBoxPerformOCR.Name = "checkBoxPerformOCR";
            this.checkBoxPerformOCR.Size = new System.Drawing.Size(88, 17);
            this.checkBoxPerformOCR.TabIndex = 0;
            this.checkBoxPerformOCR.Text = "Perform OCR";
            this.checkBoxPerformOCR.UseVisualStyleBackColor = true;
            this.checkBoxPerformOCR.CheckedChanged += new System.EventHandler(this.performOCRCheckBox_CheckedChanged);
            // 
            // groupBoxOCR
            // 
            this.groupBoxOCR.Controls.Add(this.checkBoxOCRRetrieveTextOnly);
            this.groupBoxOCR.Controls.Add(this.label27);
            this.groupBoxOCR.Controls.Add(this.textBoxOCRRegions);
            this.groupBoxOCR.Controls.Add(this.label25);
            this.groupBoxOCR.Controls.Add(this.label26);
            this.groupBoxOCR.Controls.Add(this.textBoxOCRBlackList);
            this.groupBoxOCR.Controls.Add(this.textBoxOCRWhiteList);
            this.groupBoxOCR.Controls.Add(this.comboBoxOCRLanguage);
            this.groupBoxOCR.Controls.Add(this.label23);
            this.groupBoxOCR.Controls.Add(this.checkBoxOCRPaginate);
            this.groupBoxOCR.Controls.Add(this.comboBoxOCRPerformance);
            this.groupBoxOCR.Controls.Add(this.label24);
            this.groupBoxOCR.Enabled = false;
            this.groupBoxOCR.Location = new System.Drawing.Point(9, 9);
            this.groupBoxOCR.Name = "groupBoxOCR";
            this.groupBoxOCR.Size = new System.Drawing.Size(519, 107);
            this.groupBoxOCR.TabIndex = 10;
            this.groupBoxOCR.TabStop = false;
            // 
            // checkBoxOCRRetrieveTextOnly
            // 
            this.checkBoxOCRRetrieveTextOnly.AutoSize = true;
            this.checkBoxOCRRetrieveTextOnly.Location = new System.Drawing.Point(81, 79);
            this.checkBoxOCRRetrieveTextOnly.Name = "checkBoxOCRRetrieveTextOnly";
            this.checkBoxOCRRetrieveTextOnly.Size = new System.Drawing.Size(108, 17);
            this.checkBoxOCRRetrieveTextOnly.TabIndex = 11;
            this.checkBoxOCRRetrieveTextOnly.Text = "Retrieve text only";
            this.checkBoxOCRRetrieveTextOnly.UseVisualStyleBackColor = true;
            // 
            // label27
            // 
            this.label27.AutoSize = true;
            this.label27.Location = new System.Drawing.Point(171, 53);
            this.label27.Name = "label27";
            this.label27.Size = new System.Drawing.Size(49, 13);
            this.label27.TabIndex = 11;
            this.label27.Text = "Regions:";
            // 
            // label25
            // 
            this.label25.AutoSize = true;
            this.label25.Location = new System.Drawing.Point(342, 26);
            this.label25.Name = "label25";
            this.label25.Size = new System.Drawing.Size(53, 13);
            this.label25.TabIndex = 6;
            this.label25.Text = "White list:";
            // 
            // label26
            // 
            this.label26.AutoSize = true;
            this.label26.Location = new System.Drawing.Point(168, 26);
            this.label26.Name = "label26";
            this.label26.Size = new System.Drawing.Size(52, 13);
            this.label26.TabIndex = 9;
            this.label26.Text = "Black list:";
            // 
            // comboBoxOCRLanguage
            // 
            this.comboBoxOCRLanguage.FormattingEnabled = true;
            this.comboBoxOCRLanguage.Location = new System.Drawing.Point(82, 23);
            this.comboBoxOCRLanguage.Name = "comboBoxOCRLanguage";
            this.comboBoxOCRLanguage.Size = new System.Drawing.Size(80, 21);
            this.comboBoxOCRLanguage.TabIndex = 1;
            // 
            // label23
            // 
            this.label23.AutoSize = true;
            this.label23.Location = new System.Drawing.Point(18, 26);
            this.label23.Name = "label23";
            this.label23.Size = new System.Drawing.Size(58, 13);
            this.label23.TabIndex = 2;
            this.label23.Text = "Language:";
            // 
            // checkBoxOCRPaginate
            // 
            this.checkBoxOCRPaginate.AutoSize = true;
            this.checkBoxOCRPaginate.Location = new System.Drawing.Point(9, 79);
            this.checkBoxOCRPaginate.Name = "checkBoxOCRPaginate";
            this.checkBoxOCRPaginate.Size = new System.Drawing.Size(68, 17);
            this.checkBoxOCRPaginate.TabIndex = 5;
            this.checkBoxOCRPaginate.Text = "Paginate";
            this.checkBoxOCRPaginate.UseVisualStyleBackColor = true;
            // 
            // comboBoxOCRPerformance
            // 
            this.comboBoxOCRPerformance.FormattingEnabled = true;
            this.comboBoxOCRPerformance.Location = new System.Drawing.Point(82, 50);
            this.comboBoxOCRPerformance.Name = "comboBoxOCRPerformance";
            this.comboBoxOCRPerformance.Size = new System.Drawing.Size(80, 21);
            this.comboBoxOCRPerformance.TabIndex = 4;
            // 
            // label24
            // 
            this.label24.AutoSize = true;
            this.label24.Location = new System.Drawing.Point(6, 53);
            this.label24.Name = "label24";
            this.label24.Size = new System.Drawing.Size(70, 13);
            this.label24.TabIndex = 3;
            this.label24.Text = "Performance:";
            // 
            // tabPagePDFViewerPreferences
            // 
            this.tabPagePDFViewerPreferences.Controls.Add(this.comboBoxPageScalingMode);
            this.tabPagePDFViewerPreferences.Controls.Add(this.label22);
            this.tabPagePDFViewerPreferences.Controls.Add(this.comboBoxNavigationPane);
            this.tabPagePDFViewerPreferences.Controls.Add(this.label21);
            this.tabPagePDFViewerPreferences.Controls.Add(this.comboBoxPageLayout);
            this.tabPagePDFViewerPreferences.Controls.Add(this.label7);
            this.tabPagePDFViewerPreferences.Controls.Add(this.checkBoxFullScreen);
            this.tabPagePDFViewerPreferences.Controls.Add(this.checkBoxHideEmptyNavigationPane);
            this.tabPagePDFViewerPreferences.Controls.Add(this.checkBoxHideWindowUI);
            this.tabPagePDFViewerPreferences.Controls.Add(this.checkBoxHideToolbar);
            this.tabPagePDFViewerPreferences.Controls.Add(this.checkBoxHideMenubar);
            this.tabPagePDFViewerPreferences.Controls.Add(this.checkBoxFitWindow);
            this.tabPagePDFViewerPreferences.Controls.Add(this.checkBoxDisplayTitle);
            this.tabPagePDFViewerPreferences.Controls.Add(this.checkBoxCenterWindow);
            this.tabPagePDFViewerPreferences.Location = new System.Drawing.Point(4, 22);
            this.tabPagePDFViewerPreferences.Name = "tabPagePDFViewerPreferences";
            this.tabPagePDFViewerPreferences.Padding = new System.Windows.Forms.Padding(3);
            this.tabPagePDFViewerPreferences.Size = new System.Drawing.Size(537, 122);
            this.tabPagePDFViewerPreferences.TabIndex = 1;
            this.tabPagePDFViewerPreferences.Text = "PDF Viewer Preferences";
            this.tabPagePDFViewerPreferences.UseVisualStyleBackColor = true;
            // 
            // comboBoxPageScalingMode
            // 
            this.comboBoxPageScalingMode.FormattingEnabled = true;
            this.comboBoxPageScalingMode.Items.AddRange(new object[] {
            "Default",
            "None"});
            this.comboBoxPageScalingMode.Location = new System.Drawing.Point(351, 94);
            this.comboBoxPageScalingMode.Name = "comboBoxPageScalingMode";
            this.comboBoxPageScalingMode.Size = new System.Drawing.Size(111, 21);
            this.comboBoxPageScalingMode.TabIndex = 11;
            this.comboBoxPageScalingMode.Text = "Default";
            // 
            // label22
            // 
            this.label22.AutoSize = true;
            this.label22.Location = new System.Drawing.Point(255, 97);
            this.label22.Name = "label22";
            this.label22.Size = new System.Drawing.Size(70, 13);
            this.label22.TabIndex = 13;
            this.label22.Text = "Page Scaling";
            // 
            // comboBoxNavigationPane
            // 
            this.comboBoxNavigationPane.FormattingEnabled = true;
            this.comboBoxNavigationPane.Items.AddRange(new object[] {
            "None",
            "Bookmarks",
            "Thumbnails",
            "OptionalContent",
            "Attachments"});
            this.comboBoxNavigationPane.Location = new System.Drawing.Point(351, 48);
            this.comboBoxNavigationPane.Name = "comboBoxNavigationPane";
            this.comboBoxNavigationPane.Size = new System.Drawing.Size(111, 21);
            this.comboBoxNavigationPane.TabIndex = 9;
            this.comboBoxNavigationPane.Text = "None";
            // 
            // label21
            // 
            this.label21.AutoSize = true;
            this.label21.Location = new System.Drawing.Point(255, 51);
            this.label21.Name = "label21";
            this.label21.Size = new System.Drawing.Size(86, 13);
            this.label21.TabIndex = 11;
            this.label21.Text = "Navigation Pane";
            // 
            // comboBoxPageLayout
            // 
            this.comboBoxPageLayout.FormattingEnabled = true;
            this.comboBoxPageLayout.Items.AddRange(new object[] {
            "SinglePage",
            "OneColumn",
            "TwoColumnLeft",
            "TwoColumnRight",
            "TwoPageLeft",
            "TwoPageRight"});
            this.comboBoxPageLayout.Location = new System.Drawing.Point(351, 71);
            this.comboBoxPageLayout.Name = "comboBoxPageLayout";
            this.comboBoxPageLayout.Size = new System.Drawing.Size(111, 21);
            this.comboBoxPageLayout.TabIndex = 10;
            this.comboBoxPageLayout.Text = "SinglePage";
            // 
            // label7
            // 
            this.label7.AutoSize = true;
            this.label7.Location = new System.Drawing.Point(255, 74);
            this.label7.Name = "label7";
            this.label7.Size = new System.Drawing.Size(67, 13);
            this.label7.TabIndex = 9;
            this.label7.Text = "Page Layout";
            // 
            // checkBoxFullScreen
            // 
            this.checkBoxFullScreen.AutoSize = true;
            this.checkBoxFullScreen.Location = new System.Drawing.Point(236, 6);
            this.checkBoxFullScreen.Name = "checkBoxFullScreen";
            this.checkBoxFullScreen.Size = new System.Drawing.Size(180, 17);
            this.checkBoxFullScreen.TabIndex = 7;
            this.checkBoxFullScreen.Text = "Display PDF in Full Screen mode";
            this.checkBoxFullScreen.UseVisualStyleBackColor = true;
            // 
            // checkBoxHideEmptyNavigationPane
            // 
            this.checkBoxHideEmptyNavigationPane.AutoSize = true;
            this.checkBoxHideEmptyNavigationPane.Location = new System.Drawing.Point(236, 25);
            this.checkBoxHideEmptyNavigationPane.Name = "checkBoxHideEmptyNavigationPane";
            this.checkBoxHideEmptyNavigationPane.Size = new System.Drawing.Size(162, 17);
            this.checkBoxHideEmptyNavigationPane.TabIndex = 8;
            this.checkBoxHideEmptyNavigationPane.Text = "Hide Empty Navigation Pane";
            this.checkBoxHideEmptyNavigationPane.UseVisualStyleBackColor = true;
            // 
            // checkBoxHideWindowUI
            // 
            this.checkBoxHideWindowUI.AutoSize = true;
            this.checkBoxHideWindowUI.Location = new System.Drawing.Point(10, 96);
            this.checkBoxHideWindowUI.Name = "checkBoxHideWindowUI";
            this.checkBoxHideWindowUI.Size = new System.Drawing.Size(163, 17);
            this.checkBoxHideWindowUI.TabIndex = 6;
            this.checkBoxHideWindowUI.Text = "Hide PDF Viewer Window UI";
            this.checkBoxHideWindowUI.UseVisualStyleBackColor = true;
            // 
            // checkBoxHideToolbar
            // 
            this.checkBoxHideToolbar.AutoSize = true;
            this.checkBoxHideToolbar.Location = new System.Drawing.Point(10, 78);
            this.checkBoxHideToolbar.Name = "checkBoxHideToolbar";
            this.checkBoxHideToolbar.Size = new System.Drawing.Size(150, 17);
            this.checkBoxHideToolbar.TabIndex = 5;
            this.checkBoxHideToolbar.Text = "Hide PDF Viewer Tool Bar";
            this.checkBoxHideToolbar.UseVisualStyleBackColor = true;
            // 
            // checkBoxHideMenubar
            // 
            this.checkBoxHideMenubar.AutoSize = true;
            this.checkBoxHideMenubar.Location = new System.Drawing.Point(10, 60);
            this.checkBoxHideMenubar.Name = "checkBoxHideMenubar";
            this.checkBoxHideMenubar.Size = new System.Drawing.Size(155, 17);
            this.checkBoxHideMenubar.TabIndex = 4;
            this.checkBoxHideMenubar.Text = "Hide PDF Viewer Menu bar";
            this.checkBoxHideMenubar.UseVisualStyleBackColor = true;
            // 
            // checkBoxFitWindow
            // 
            this.checkBoxFitWindow.AutoSize = true;
            this.checkBoxFitWindow.Location = new System.Drawing.Point(10, 42);
            this.checkBoxFitWindow.Name = "checkBoxFitWindow";
            this.checkBoxFitWindow.Size = new System.Drawing.Size(181, 17);
            this.checkBoxFitWindow.TabIndex = 3;
            this.checkBoxFitWindow.Text = "Resize PDF Viewer to Document";
            this.checkBoxFitWindow.UseVisualStyleBackColor = true;
            // 
            // checkBoxDisplayTitle
            // 
            this.checkBoxDisplayTitle.AutoSize = true;
            this.checkBoxDisplayTitle.Location = new System.Drawing.Point(10, 24);
            this.checkBoxDisplayTitle.Name = "checkBoxDisplayTitle";
            this.checkBoxDisplayTitle.Size = new System.Drawing.Size(135, 17);
            this.checkBoxDisplayTitle.TabIndex = 2;
            this.checkBoxDisplayTitle.Text = "Display Document Title";
            this.checkBoxDisplayTitle.UseVisualStyleBackColor = true;
            // 
            // checkBoxCenterWindow
            // 
            this.checkBoxCenterWindow.AutoSize = true;
            this.checkBoxCenterWindow.Location = new System.Drawing.Point(10, 6);
            this.checkBoxCenterWindow.Name = "checkBoxCenterWindow";
            this.checkBoxCenterWindow.Size = new System.Drawing.Size(158, 17);
            this.checkBoxCenterWindow.TabIndex = 1;
            this.checkBoxCenterWindow.Text = "Center PDF Viewer Window";
            this.checkBoxCenterWindow.UseVisualStyleBackColor = true;
            // 
            // tabPagePDFPostProcessing
            // 
            this.tabPagePDFPostProcessing.Controls.Add(this.checkBoxPostProcessFile);
            this.tabPagePDFPostProcessing.Controls.Add(this.groupBoxPostProcess);
            this.tabPagePDFPostProcessing.Controls.Add(this.comboBoxQuality);
            this.tabPagePDFPostProcessing.Controls.Add(this.checkBoxIncludeSampleWatermarks);
            this.tabPagePDFPostProcessing.Controls.Add(this.label4);
            this.tabPagePDFPostProcessing.Controls.Add(this.label6);
            this.tabPagePDFPostProcessing.Controls.Add(this.textBoxEndPage);
            this.tabPagePDFPostProcessing.Controls.Add(this.textBoxStartPage);
            this.tabPagePDFPostProcessing.Location = new System.Drawing.Point(4, 22);
            this.tabPagePDFPostProcessing.Name = "tabPagePDFPostProcessing";
            this.tabPagePDFPostProcessing.Size = new System.Drawing.Size(537, 122);
            this.tabPagePDFPostProcessing.TabIndex = 2;
            this.tabPagePDFPostProcessing.Text = "PDF Post Processing";
            this.tabPagePDFPostProcessing.UseVisualStyleBackColor = true;
            // 
            // checkBoxPostProcessFile
            // 
            this.checkBoxPostProcessFile.AutoSize = true;
            this.checkBoxPostProcessFile.Location = new System.Drawing.Point(16, 41);
            this.checkBoxPostProcessFile.Name = "checkBoxPostProcessFile";
            this.checkBoxPostProcessFile.Size = new System.Drawing.Size(290, 17);
            this.checkBoxPostProcessFile.TabIndex = 5;
            this.checkBoxPostProcessFile.Text = "Post Process File (Requires PDF Converter Pro License)";
            this.checkBoxPostProcessFile.UseVisualStyleBackColor = true;
            this.checkBoxPostProcessFile.CheckedChanged += new System.EventHandler(this.checkBoxPostProcessFile_CheckedChanged);
            // 
            // groupBoxPostProcess
            // 
            this.groupBoxPostProcess.Controls.Add(this.checkBoxSubsetFonts);
            this.groupBoxPostProcess.Controls.Add(this.comboBoxPDFProfile);
            this.groupBoxPostProcess.Controls.Add(this.checkBoxEmbedAllFonts);
            this.groupBoxPostProcess.Controls.Add(this.checkBoxEnableFastWebView);
            this.groupBoxPostProcess.Enabled = false;
            this.groupBoxPostProcess.Location = new System.Drawing.Point(10, 43);
            this.groupBoxPostProcess.Name = "groupBoxPostProcess";
            this.groupBoxPostProcess.Size = new System.Drawing.Size(521, 64);
            this.groupBoxPostProcess.TabIndex = 36;
            this.groupBoxPostProcess.TabStop = false;
            // 
            // checkBoxSubsetFonts
            // 
            this.checkBoxSubsetFonts.AutoSize = true;
            this.checkBoxSubsetFonts.Location = new System.Drawing.Point(208, 26);
            this.checkBoxSubsetFonts.Name = "checkBoxSubsetFonts";
            this.checkBoxSubsetFonts.Size = new System.Drawing.Size(88, 17);
            this.checkBoxSubsetFonts.TabIndex = 8;
            this.checkBoxSubsetFonts.Text = "Subset Fonts";
            this.checkBoxSubsetFonts.UseVisualStyleBackColor = true;
            // 
            // checkBoxEmbedAllFonts
            // 
            this.checkBoxEmbedAllFonts.AutoSize = true;
            this.checkBoxEmbedAllFonts.Location = new System.Drawing.Point(96, 26);
            this.checkBoxEmbedAllFonts.Name = "checkBoxEmbedAllFonts";
            this.checkBoxEmbedAllFonts.Size = new System.Drawing.Size(102, 17);
            this.checkBoxEmbedAllFonts.TabIndex = 7;
            this.checkBoxEmbedAllFonts.Text = "Embed All Fonts";
            this.checkBoxEmbedAllFonts.UseVisualStyleBackColor = true;
            // 
            // checkBoxEnableFastWebView
            // 
            this.checkBoxEnableFastWebView.AutoSize = true;
            this.checkBoxEnableFastWebView.Location = new System.Drawing.Point(310, 26);
            this.checkBoxEnableFastWebView.Name = "checkBoxEnableFastWebView";
            this.checkBoxEnableFastWebView.Size = new System.Drawing.Size(204, 17);
            this.checkBoxEnableFastWebView.TabIndex = 9;
            this.checkBoxEnableFastWebView.Text = "Enable Fast Web View / Linearization";
            this.checkBoxEnableFastWebView.UseVisualStyleBackColor = true;
            // 
            // checkBoxIncludeSampleWatermarks
            // 
            this.checkBoxIncludeSampleWatermarks.AutoSize = true;
            this.checkBoxIncludeSampleWatermarks.Location = new System.Drawing.Point(387, 13);
            this.checkBoxIncludeSampleWatermarks.Name = "checkBoxIncludeSampleWatermarks";
            this.checkBoxIncludeSampleWatermarks.Size = new System.Drawing.Size(145, 17);
            this.checkBoxIncludeSampleWatermarks.TabIndex = 4;
            this.checkBoxIncludeSampleWatermarks.Text = "Include Test Watermarks";
            this.checkBoxIncludeSampleWatermarks.UseVisualStyleBackColor = true;
            // 
            // tabPageMiscellaneous
            // 
            this.tabPageMiscellaneous.Controls.Add(this.label42);
            this.tabPageMiscellaneous.Controls.Add(this.buttonBrowseTemplate);
            this.tabPageMiscellaneous.Controls.Add(this.textBoxTemplatePassword);
            this.tabPageMiscellaneous.Controls.Add(this.textBoxTemplateUsername);
            this.tabPageMiscellaneous.Controls.Add(this.textBoxTemplateFile);
            this.tabPageMiscellaneous.Controls.Add(this.comboBoxPageOrientation);
            this.tabPageMiscellaneous.Controls.Add(this.label14);
            this.tabPageMiscellaneous.Controls.Add(this.label5);
            this.tabPageMiscellaneous.Controls.Add(this.comboBoxBookmarks);
            this.tabPageMiscellaneous.Controls.Add(this.checkBoxRefreshContent);
            this.tabPageMiscellaneous.Controls.Add(this.comboBoxRange);
            this.tabPageMiscellaneous.Controls.Add(this.label10);
            this.tabPageMiscellaneous.Controls.Add(this.label41);
            this.tabPageMiscellaneous.Controls.Add(this.label40);
            this.tabPageMiscellaneous.Controls.Add(this.label39);
            this.tabPageMiscellaneous.Controls.Add(this.label12);
            this.tabPageMiscellaneous.Controls.Add(this.comboBoxMacroSecurityOptions);
            this.tabPageMiscellaneous.Controls.Add(this.label11);
            this.tabPageMiscellaneous.Controls.Add(this.comboBoxFidelity);
            this.tabPageMiscellaneous.Location = new System.Drawing.Point(4, 22);
            this.tabPageMiscellaneous.Name = "tabPageMiscellaneous";
            this.tabPageMiscellaneous.Size = new System.Drawing.Size(537, 122);
            this.tabPageMiscellaneous.TabIndex = 3;
            this.tabPageMiscellaneous.Text = "Miscellaneous";
            this.tabPageMiscellaneous.UseVisualStyleBackColor = true;
            // 
            // label42
            // 
            this.label42.AutoSize = true;
            this.label42.Location = new System.Drawing.Point(342, 74);
            this.label42.MaximumSize = new System.Drawing.Size(190, 0);
            this.label42.Name = "label42";
            this.label42.Size = new System.Drawing.Size(185, 39);
            this.label42.TabIndex = 35;
            this.label42.Text = "For InfoPath / PDF Forms specify the template file (XSN, PDF) or the URL and opti" +
    "onal credentials.";
            // 
            // buttonBrowseTemplate
            // 
            this.buttonBrowseTemplate.Location = new System.Drawing.Point(309, 71);
            this.buttonBrowseTemplate.Name = "buttonBrowseTemplate";
            this.buttonBrowseTemplate.Size = new System.Drawing.Size(26, 20);
            this.buttonBrowseTemplate.TabIndex = 19;
            this.buttonBrowseTemplate.Text = "...";
            this.buttonBrowseTemplate.UseVisualStyleBackColor = true;
            this.buttonBrowseTemplate.Click += new System.EventHandler(this.buttonBrowseTemplate_Click);
            // 
            // textBoxTemplatePassword
            // 
            this.textBoxTemplatePassword.Location = new System.Drawing.Point(235, 97);
            this.textBoxTemplatePassword.Name = "textBoxTemplatePassword";
            this.textBoxTemplatePassword.PasswordChar = '*';
            this.textBoxTemplatePassword.Size = new System.Drawing.Size(100, 20);
            this.textBoxTemplatePassword.TabIndex = 34;
            // 
            // textBoxTemplateUsername
            // 
            this.textBoxTemplateUsername.Location = new System.Drawing.Point(67, 97);
            this.textBoxTemplateUsername.Name = "textBoxTemplateUsername";
            this.textBoxTemplateUsername.Size = new System.Drawing.Size(100, 20);
            this.textBoxTemplateUsername.TabIndex = 33;
            // 
            // textBoxTemplateFile
            // 
            this.textBoxTemplateFile.Location = new System.Drawing.Point(67, 71);
            this.textBoxTemplateFile.Name = "textBoxTemplateFile";
            this.textBoxTemplateFile.Size = new System.Drawing.Size(239, 20);
            this.textBoxTemplateFile.TabIndex = 31;
            // 
            // comboBoxPageOrientation
            // 
            this.comboBoxPageOrientation.FormattingEnabled = true;
            this.comboBoxPageOrientation.Items.AddRange(new object[] {
            "Default",
            "Portrait",
            "Landscape"});
            this.comboBoxPageOrientation.Location = new System.Drawing.Point(422, 8);
            this.comboBoxPageOrientation.Name = "comboBoxPageOrientation";
            this.comboBoxPageOrientation.Size = new System.Drawing.Size(102, 21);
            this.comboBoxPageOrientation.TabIndex = 3;
            this.comboBoxPageOrientation.Text = "Default";
            // 
            // label14
            // 
            this.label14.AutoSize = true;
            this.label14.Location = new System.Drawing.Point(358, 10);
            this.label14.Name = "label14";
            this.label14.Size = new System.Drawing.Size(58, 13);
            this.label14.TabIndex = 30;
            this.label14.Text = "Orientation";
            // 
            // comboBoxRange
            // 
            this.comboBoxRange.FormattingEnabled = true;
            this.comboBoxRange.Items.AddRange(new object[] {
            "VisibleDocuments",
            "AllDocuments",
            "ActiveDocuments"});
            this.comboBoxRange.Location = new System.Drawing.Point(67, 35);
            this.comboBoxRange.Name = "comboBoxRange";
            this.comboBoxRange.Size = new System.Drawing.Size(102, 21);
            this.comboBoxRange.TabIndex = 4;
            this.comboBoxRange.Text = "VisibleDocuments";
            // 
            // label41
            // 
            this.label41.AutoSize = true;
            this.label41.Location = new System.Drawing.Point(179, 100);
            this.label41.Name = "label41";
            this.label41.Size = new System.Drawing.Size(53, 13);
            this.label41.TabIndex = 26;
            this.label41.Text = "Password";
            // 
            // label40
            // 
            this.label40.AutoSize = true;
            this.label40.Location = new System.Drawing.Point(6, 100);
            this.label40.Name = "label40";
            this.label40.Size = new System.Drawing.Size(55, 13);
            this.label40.TabIndex = 26;
            this.label40.Text = "Username";
            // 
            // label39
            // 
            this.label39.AutoSize = true;
            this.label39.Location = new System.Drawing.Point(11, 74);
            this.label39.Name = "label39";
            this.label39.Size = new System.Drawing.Size(51, 13);
            this.label39.TabIndex = 26;
            this.label39.Text = "Template";
            // 
            // label12
            // 
            this.label12.AutoSize = true;
            this.label12.Location = new System.Drawing.Point(23, 39);
            this.label12.Name = "label12";
            this.label12.Size = new System.Drawing.Size(39, 13);
            this.label12.TabIndex = 26;
            this.label12.Text = "Range";
            // 
            // tabPageDocumentInformation
            // 
            this.tabPageDocumentInformation.Controls.Add(this.checkBoxGetDocPropertyiesIgnoreErros);
            this.tabPageDocumentInformation.Controls.Add(this.buttonAddDocProperty);
            this.tabPageDocumentInformation.Controls.Add(this.dataGridViewDocumentPropertySettings);
            this.tabPageDocumentInformation.Location = new System.Drawing.Point(4, 22);
            this.tabPageDocumentInformation.Name = "tabPageDocumentInformation";
            this.tabPageDocumentInformation.Padding = new System.Windows.Forms.Padding(3);
            this.tabPageDocumentInformation.Size = new System.Drawing.Size(537, 122);
            this.tabPageDocumentInformation.TabIndex = 5;
            this.tabPageDocumentInformation.Text = "Doc Info";
            this.tabPageDocumentInformation.UseVisualStyleBackColor = true;
            // 
            // checkBoxGetDocPropertyiesIgnoreErros
            // 
            this.checkBoxGetDocPropertyiesIgnoreErros.AutoSize = true;
            this.checkBoxGetDocPropertyiesIgnoreErros.Checked = true;
            this.checkBoxGetDocPropertyiesIgnoreErros.CheckState = System.Windows.Forms.CheckState.Indeterminate;
            this.checkBoxGetDocPropertyiesIgnoreErros.Location = new System.Drawing.Point(0, 105);
            this.checkBoxGetDocPropertyiesIgnoreErros.Name = "checkBoxGetDocPropertyiesIgnoreErros";
            this.checkBoxGetDocPropertyiesIgnoreErros.Size = new System.Drawing.Size(86, 17);
            this.checkBoxGetDocPropertyiesIgnoreErros.TabIndex = 2;
            this.checkBoxGetDocPropertyiesIgnoreErros.Text = "Ignore Errors";
            this.checkBoxGetDocPropertyiesIgnoreErros.ThreeState = true;
            this.checkBoxGetDocPropertyiesIgnoreErros.UseVisualStyleBackColor = true;
            // 
            // buttonAddDocProperty
            // 
            this.buttonAddDocProperty.Location = new System.Drawing.Point(514, 2);
            this.buttonAddDocProperty.Name = "buttonAddDocProperty";
            this.buttonAddDocProperty.Size = new System.Drawing.Size(23, 23);
            this.buttonAddDocProperty.TabIndex = 1;
            this.buttonAddDocProperty.Text = "+";
            this.buttonAddDocProperty.UseVisualStyleBackColor = true;
            this.buttonAddDocProperty.Click += new System.EventHandler(this.buttonAddDocProperty_Click);
            // 
            // dataGridViewDocumentPropertySettings
            // 
            this.dataGridViewDocumentPropertySettings.ColumnHeadersHeightSizeMode = System.Windows.Forms.DataGridViewColumnHeadersHeightSizeMode.AutoSize;
            this.dataGridViewDocumentPropertySettings.Location = new System.Drawing.Point(0, 2);
            this.dataGridViewDocumentPropertySettings.Name = "dataGridViewDocumentPropertySettings";
            this.dataGridViewDocumentPropertySettings.Size = new System.Drawing.Size(512, 97);
            this.dataGridViewDocumentPropertySettings.TabIndex = 0;
            // 
            // buttonBrowse
            // 
            this.buttonBrowse.Location = new System.Drawing.Point(234, 8);
            this.buttonBrowse.Name = "buttonBrowse";
            this.buttonBrowse.Size = new System.Drawing.Size(26, 20);
            this.buttonBrowse.TabIndex = 2;
            this.buttonBrowse.Text = "...";
            this.buttonBrowse.UseVisualStyleBackColor = true;
            this.buttonBrowse.Click += new System.EventHandler(this.buttonBrowse_Click);
            // 
            // buttonMergeFolder
            // 
            this.buttonMergeFolder.Location = new System.Drawing.Point(290, 189);
            this.buttonMergeFolder.Name = "buttonMergeFolder";
            this.buttonMergeFolder.Size = new System.Drawing.Size(140, 23);
            this.buttonMergeFolder.TabIndex = 17;
            this.buttonMergeFolder.Text = "Merge Folder";
            this.buttonMergeFolder.UseVisualStyleBackColor = true;
            this.buttonMergeFolder.Click += new System.EventHandler(this.buttonMergeFolder_Click);
            // 
            // tabPageHTML
            // 
            this.tabPageHTML.Controls.Add(this.numericUpDownConversionDelay);
            this.tabPageHTML.Controls.Add(this.comboBoxAuthenticationMode);
            this.tabPageHTML.Controls.Add(this.comboBoxHtmlRenderingEngine);
            this.tabPageHTML.Controls.Add(this.groupBox3);
            this.tabPageHTML.Controls.Add(this.groupBox2);
            this.tabPageHTML.Controls.Add(this.textBoxHTMLUserName);
            this.tabPageHTML.Controls.Add(this.comboBoxMediaType);
            this.tabPageHTML.Controls.Add(this.label35);
            this.tabPageHTML.Controls.Add(this.textBoxHTMLPassword);
            this.tabPageHTML.Controls.Add(this.label33);
            this.tabPageHTML.Controls.Add(this.label34);
            this.tabPageHTML.Controls.Add(this.label17);
            this.tabPageHTML.Controls.Add(this.label18);
            this.tabPageHTML.Controls.Add(this.label16);
            this.tabPageHTML.Controls.Add(this.label15);
            this.tabPageHTML.Location = new System.Drawing.Point(4, 22);
            this.tabPageHTML.Name = "tabPageHTML";
            this.tabPageHTML.Size = new System.Drawing.Size(557, 217);
            this.tabPageHTML.TabIndex = 3;
            this.tabPageHTML.Text = "HTML Conversion";
            this.tabPageHTML.UseVisualStyleBackColor = true;
            // 
            // numericUpDownConversionDelay
            // 
            this.numericUpDownConversionDelay.Location = new System.Drawing.Point(440, 10);
            this.numericUpDownConversionDelay.Maximum = new decimal(new int[] {
            0,
            0,
            0,
            0});
            this.numericUpDownConversionDelay.Minimum = new decimal(new int[] {
            1,
            0,
            0,
            -2147483648});
            this.numericUpDownConversionDelay.Name = "numericUpDownConversionDelay";
            this.numericUpDownConversionDelay.Size = new System.Drawing.Size(70, 20);
            this.numericUpDownConversionDelay.TabIndex = 10;
            this.numericUpDownConversionDelay.Value = new decimal(new int[] {
            1,
            0,
            0,
            -2147483648});
            // 
            // comboBoxAuthenticationMode
            // 
            this.comboBoxAuthenticationMode.FormattingEnabled = true;
            this.comboBoxAuthenticationMode.Items.AddRange(new object[] {
            "Default",
            "Web",
            "MS Online"});
            this.comboBoxAuthenticationMode.Location = new System.Drawing.Point(83, 36);
            this.comboBoxAuthenticationMode.Name = "comboBoxAuthenticationMode";
            this.comboBoxAuthenticationMode.Size = new System.Drawing.Size(114, 21);
            this.comboBoxAuthenticationMode.TabIndex = 11;
            this.comboBoxAuthenticationMode.Text = "Default";
            // 
            // comboBoxHtmlRenderingEngine
            // 
            this.comboBoxHtmlRenderingEngine.FormattingEnabled = true;
            this.comboBoxHtmlRenderingEngine.Items.AddRange(new object[] {
            "Default",
            "IE",
            "WebKit"});
            this.comboBoxHtmlRenderingEngine.Location = new System.Drawing.Point(83, 9);
            this.comboBoxHtmlRenderingEngine.Name = "comboBoxHtmlRenderingEngine";
            this.comboBoxHtmlRenderingEngine.Size = new System.Drawing.Size(114, 21);
            this.comboBoxHtmlRenderingEngine.TabIndex = 8;
            this.comboBoxHtmlRenderingEngine.Text = "Default";
            // 
            // groupBox3
            // 
            this.groupBox3.Controls.Add(this.textBoxHTMLurl);
            this.groupBox3.Controls.Add(this.buttonConvertURL);
            this.groupBox3.Location = new System.Drawing.Point(3, 65);
            this.groupBox3.Name = "groupBox3";
            this.groupBox3.Size = new System.Drawing.Size(551, 50);
            this.groupBox3.TabIndex = 14;
            this.groupBox3.TabStop = false;
            this.groupBox3.Text = "URL to Convert";
            // 
            // textBoxHTMLurl
            // 
            this.textBoxHTMLurl.Location = new System.Drawing.Point(8, 21);
            this.textBoxHTMLurl.Name = "textBoxHTMLurl";
            this.textBoxHTMLurl.Size = new System.Drawing.Size(465, 20);
            this.textBoxHTMLurl.TabIndex = 1;
            this.textBoxHTMLurl.Text = "http://www.muhimbi.com/Products/PDF-Converter-Services/summary.aspx";
            // 
            // buttonConvertURL
            // 
            this.buttonConvertURL.Location = new System.Drawing.Point(479, 20);
            this.buttonConvertURL.Name = "buttonConvertURL";
            this.buttonConvertURL.Size = new System.Drawing.Size(64, 23);
            this.buttonConvertURL.TabIndex = 4;
            this.buttonConvertURL.Text = "Convert";
            this.buttonConvertURL.UseVisualStyleBackColor = true;
            this.buttonConvertURL.Click += new System.EventHandler(this.buttonConvertURL_Click);
            // 
            // groupBox2
            // 
            this.groupBox2.Controls.Add(this.textBoxHTMLCode);
            this.groupBox2.Controls.Add(this.buttonConvertHTML);
            this.groupBox2.Location = new System.Drawing.Point(3, 123);
            this.groupBox2.Name = "groupBox2";
            this.groupBox2.Size = new System.Drawing.Size(551, 91);
            this.groupBox2.TabIndex = 15;
            this.groupBox2.TabStop = false;
            this.groupBox2.Text = "HTML to Convert";
            // 
            // textBoxHTMLCode
            // 
            this.textBoxHTMLCode.Location = new System.Drawing.Point(8, 21);
            this.textBoxHTMLCode.Multiline = true;
            this.textBoxHTMLCode.Name = "textBoxHTMLCode";
            this.textBoxHTMLCode.ScrollBars = System.Windows.Forms.ScrollBars.Both;
            this.textBoxHTMLCode.Size = new System.Drawing.Size(465, 61);
            this.textBoxHTMLCode.TabIndex = 5;
            this.textBoxHTMLCode.Text = "<html><body>\r\n  <img src=\"http://www.muhimbi.com/img/cms_order_logo.gif\" style=\"f" +
    "loat:right\">\r\n  <h1>HTML to PDF Conversion</h1>\r\n  This is a <b>test</b><br/>\r\n<" +
    "/body></html>";
            // 
            // buttonConvertHTML
            // 
            this.buttonConvertHTML.Location = new System.Drawing.Point(479, 59);
            this.buttonConvertHTML.Name = "buttonConvertHTML";
            this.buttonConvertHTML.Size = new System.Drawing.Size(64, 23);
            this.buttonConvertHTML.TabIndex = 6;
            this.buttonConvertHTML.Text = "Convert";
            this.buttonConvertHTML.UseVisualStyleBackColor = true;
            this.buttonConvertHTML.Click += new System.EventHandler(this.buttonConvertHTML_Click);
            // 
            // textBoxHTMLUserName
            // 
            this.textBoxHTMLUserName.Location = new System.Drawing.Point(264, 36);
            this.textBoxHTMLUserName.Name = "textBoxHTMLUserName";
            this.textBoxHTMLUserName.Size = new System.Drawing.Size(114, 20);
            this.textBoxHTMLUserName.TabIndex = 12;
            // 
            // comboBoxMediaType
            // 
            this.comboBoxMediaType.FormattingEnabled = true;
            this.comboBoxMediaType.Items.AddRange(new object[] {
            "Default",
            "Screen",
            "Print"});
            this.comboBoxMediaType.Location = new System.Drawing.Point(264, 9);
            this.comboBoxMediaType.Name = "comboBoxMediaType";
            this.comboBoxMediaType.Size = new System.Drawing.Size(114, 21);
            this.comboBoxMediaType.TabIndex = 9;
            this.comboBoxMediaType.Text = "Default";
            // 
            // label35
            // 
            this.label35.AutoSize = true;
            this.label35.Location = new System.Drawing.Point(227, 12);
            this.label35.Name = "label35";
            this.label35.Size = new System.Drawing.Size(39, 13);
            this.label35.TabIndex = 10;
            this.label35.Text = "Media:";
            // 
            // textBoxHTMLPassword
            // 
            this.textBoxHTMLPassword.Location = new System.Drawing.Point(440, 36);
            this.textBoxHTMLPassword.Name = "textBoxHTMLPassword";
            this.textBoxHTMLPassword.Size = new System.Drawing.Size(106, 20);
            this.textBoxHTMLPassword.TabIndex = 13;
            this.textBoxHTMLPassword.UseSystemPasswordChar = true;
            // 
            // label33
            // 
            this.label33.AutoSize = true;
            this.label33.Location = new System.Drawing.Point(19, 12);
            this.label33.Name = "label33";
            this.label33.Size = new System.Drawing.Size(66, 13);
            this.label33.TabIndex = 3;
            this.label33.Text = "Html engine:";
            // 
            // label34
            // 
            this.label34.AutoSize = true;
            this.label34.Location = new System.Drawing.Point(7, 39);
            this.label34.Name = "label34";
            this.label34.Size = new System.Drawing.Size(78, 13);
            this.label34.TabIndex = 3;
            this.label34.Text = "Authentication:";
            // 
            // label17
            // 
            this.label17.AutoSize = true;
            this.label17.Location = new System.Drawing.Point(208, 39);
            this.label17.Name = "label17";
            this.label17.Size = new System.Drawing.Size(58, 13);
            this.label17.TabIndex = 3;
            this.label17.Text = "Username:";
            // 
            // label18
            // 
            this.label18.AutoSize = true;
            this.label18.Location = new System.Drawing.Point(386, 39);
            this.label18.Name = "label18";
            this.label18.Size = new System.Drawing.Size(56, 13);
            this.label18.TabIndex = 3;
            this.label18.Text = "Password:";
            // 
            // label16
            // 
            this.label16.AutoSize = true;
            this.label16.Location = new System.Drawing.Point(512, 12);
            this.label16.Name = "label16";
            this.label16.Size = new System.Drawing.Size(20, 13);
            this.label16.TabIndex = 3;
            this.label16.Text = "ms";
            // 
            // label15
            // 
            this.label15.AutoSize = true;
            this.label15.Location = new System.Drawing.Point(405, 12);
            this.label15.Name = "label15";
            this.label15.Size = new System.Drawing.Size(37, 13);
            this.label15.TabIndex = 3;
            this.label15.Text = "Delay:";
            // 
            // tabPageToC
            // 
            this.tabPageToC.Controls.Add(this.checkBoxEnableToC);
            this.tabPageToC.Controls.Add(this.tocGroupBox);
            this.tabPageToC.Controls.Add(this.panel2);
            this.tabPageToC.Location = new System.Drawing.Point(4, 22);
            this.tabPageToC.Name = "tabPageToC";
            this.tabPageToC.Size = new System.Drawing.Size(557, 217);
            this.tabPageToC.TabIndex = 4;
            this.tabPageToC.Text = "Table of Content";
            this.tabPageToC.UseVisualStyleBackColor = true;
            // 
            // checkBoxEnableToC
            // 
            this.checkBoxEnableToC.AutoSize = true;
            this.checkBoxEnableToC.Location = new System.Drawing.Point(12, 1);
            this.checkBoxEnableToC.Name = "checkBoxEnableToC";
            this.checkBoxEnableToC.Size = new System.Drawing.Size(141, 17);
            this.checkBoxEnableToC.TabIndex = 18;
            this.checkBoxEnableToC.Text = "Enable Table of Content";
            this.checkBoxEnableToC.UseVisualStyleBackColor = true;
            this.checkBoxEnableToC.CheckedChanged += new System.EventHandler(this.checkBoxEnableToC_CheckedChanged);
            // 
            // tocGroupBox
            // 
            this.tocGroupBox.Controls.Add(this.panel1);
            this.tocGroupBox.Controls.Add(this.panel6);
            this.tocGroupBox.Controls.Add(this.panel3);
            this.tocGroupBox.Dock = System.Windows.Forms.DockStyle.Fill;
            this.tocGroupBox.Location = new System.Drawing.Point(0, 3);
            this.tocGroupBox.Name = "tocGroupBox";
            this.tocGroupBox.Padding = new System.Windows.Forms.Padding(4, 0, 4, 5);
            this.tocGroupBox.Size = new System.Drawing.Size(557, 214);
            this.tocGroupBox.TabIndex = 17;
            this.tocGroupBox.TabStop = false;
            this.tocGroupBox.Text = "       Enable Table of Content";
            // 
            // panel1
            // 
            this.panel1.Controls.Add(this.textBoxToCTemplate);
            this.panel1.Controls.Add(this.panel5);
            this.panel1.Dock = System.Windows.Forms.DockStyle.Fill;
            this.panel1.Location = new System.Drawing.Point(251, 13);
            this.panel1.Name = "panel1";
            this.panel1.Size = new System.Drawing.Size(302, 196);
            this.panel1.TabIndex = 29;
            // 
            // textBoxToCTemplate
            // 
            this.textBoxToCTemplate.Dock = System.Windows.Forms.DockStyle.Fill;
            this.textBoxToCTemplate.Location = new System.Drawing.Point(0, 25);
            this.textBoxToCTemplate.Multiline = true;
            this.textBoxToCTemplate.Name = "textBoxToCTemplate";
            this.textBoxToCTemplate.ScrollBars = System.Windows.Forms.ScrollBars.Both;
            this.textBoxToCTemplate.Size = new System.Drawing.Size(302, 171);
            this.textBoxToCTemplate.TabIndex = 16;
            // 
            // panel5
            // 
            this.panel5.Controls.Add(this.label29);
            this.panel5.Controls.Add(this.buttonLoadTocTemplate);
            this.panel5.Dock = System.Windows.Forms.DockStyle.Top;
            this.panel5.Location = new System.Drawing.Point(0, 0);
            this.panel5.Name = "panel5";
            this.panel5.Size = new System.Drawing.Size(302, 25);
            this.panel5.TabIndex = 15;
            // 
            // label29
            // 
            this.label29.AutoSize = true;
            this.label29.Location = new System.Drawing.Point(0, 9);
            this.label29.Name = "label29";
            this.label29.Size = new System.Drawing.Size(51, 13);
            this.label29.TabIndex = 14;
            this.label29.Text = "Template";
            // 
            // buttonLoadTocTemplate
            // 
            this.buttonLoadTocTemplate.AutoSize = true;
            this.buttonLoadTocTemplate.Location = new System.Drawing.Point(217, 0);
            this.buttonLoadTocTemplate.Margin = new System.Windows.Forms.Padding(0);
            this.buttonLoadTocTemplate.Name = "buttonLoadTocTemplate";
            this.buttonLoadTocTemplate.Size = new System.Drawing.Size(83, 23);
            this.buttonLoadTocTemplate.TabIndex = 13;
            this.buttonLoadTocTemplate.Text = "Load from File";
            this.buttonLoadTocTemplate.UseVisualStyleBackColor = true;
            this.buttonLoadTocTemplate.Click += new System.EventHandler(this.buttonLoadTocTemplate_Click);
            // 
            // panel6
            // 
            this.panel6.Dock = System.Windows.Forms.DockStyle.Left;
            this.panel6.Location = new System.Drawing.Point(247, 13);
            this.panel6.Name = "panel6";
            this.panel6.Size = new System.Drawing.Size(4, 196);
            this.panel6.TabIndex = 19;
            // 
            // panel3
            // 
            this.panel3.BackColor = System.Drawing.SystemColors.Control;
            this.panel3.Controls.Add(this.panel9);
            this.panel3.Controls.Add(this.panel8);
            this.panel3.Controls.Add(this.panel4);
            this.panel3.Dock = System.Windows.Forms.DockStyle.Left;
            this.panel3.Location = new System.Drawing.Point(4, 13);
            this.panel3.Name = "panel3";
            this.panel3.Size = new System.Drawing.Size(243, 196);
            this.panel3.TabIndex = 7;
            // 
            // panel9
            // 
            this.panel9.Controls.Add(this.dataGridViewToCProperties);
            this.panel9.Controls.Add(this.label32);
            this.panel9.Dock = System.Windows.Forms.DockStyle.Fill;
            this.panel9.Location = new System.Drawing.Point(0, 61);
            this.panel9.Name = "panel9";
            this.panel9.Size = new System.Drawing.Size(243, 135);
            this.panel9.TabIndex = 0;
            // 
            // dataGridViewToCProperties
            // 
            dataGridViewCellStyle4.Alignment = System.Windows.Forms.DataGridViewContentAlignment.MiddleLeft;
            dataGridViewCellStyle4.BackColor = System.Drawing.SystemColors.Control;
            dataGridViewCellStyle4.Font = new System.Drawing.Font("Microsoft Sans Serif", 8.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            dataGridViewCellStyle4.ForeColor = System.Drawing.SystemColors.WindowText;
            dataGridViewCellStyle4.SelectionBackColor = System.Drawing.SystemColors.Highlight;
            dataGridViewCellStyle4.SelectionForeColor = System.Drawing.SystemColors.HighlightText;
            dataGridViewCellStyle4.WrapMode = System.Windows.Forms.DataGridViewTriState.True;
            this.dataGridViewToCProperties.ColumnHeadersDefaultCellStyle = dataGridViewCellStyle4;
            this.dataGridViewToCProperties.ColumnHeadersHeightSizeMode = System.Windows.Forms.DataGridViewColumnHeadersHeightSizeMode.AutoSize;
            this.dataGridViewToCProperties.Columns.AddRange(new System.Windows.Forms.DataGridViewColumn[] {
            this.name,
            this.value});
            dataGridViewCellStyle5.Alignment = System.Windows.Forms.DataGridViewContentAlignment.MiddleLeft;
            dataGridViewCellStyle5.BackColor = System.Drawing.SystemColors.Window;
            dataGridViewCellStyle5.Font = new System.Drawing.Font("Microsoft Sans Serif", 8.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            dataGridViewCellStyle5.ForeColor = System.Drawing.SystemColors.ControlText;
            dataGridViewCellStyle5.SelectionBackColor = System.Drawing.SystemColors.Highlight;
            dataGridViewCellStyle5.SelectionForeColor = System.Drawing.SystemColors.HighlightText;
            dataGridViewCellStyle5.WrapMode = System.Windows.Forms.DataGridViewTriState.False;
            this.dataGridViewToCProperties.DefaultCellStyle = dataGridViewCellStyle5;
            this.dataGridViewToCProperties.Dock = System.Windows.Forms.DockStyle.Fill;
            this.dataGridViewToCProperties.Location = new System.Drawing.Point(0, 13);
            this.dataGridViewToCProperties.Name = "dataGridViewToCProperties";
            dataGridViewCellStyle6.Alignment = System.Windows.Forms.DataGridViewContentAlignment.MiddleLeft;
            dataGridViewCellStyle6.BackColor = System.Drawing.SystemColors.Control;
            dataGridViewCellStyle6.Font = new System.Drawing.Font("Microsoft Sans Serif", 8.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            dataGridViewCellStyle6.ForeColor = System.Drawing.SystemColors.WindowText;
            dataGridViewCellStyle6.SelectionBackColor = System.Drawing.SystemColors.Highlight;
            dataGridViewCellStyle6.SelectionForeColor = System.Drawing.SystemColors.HighlightText;
            dataGridViewCellStyle6.WrapMode = System.Windows.Forms.DataGridViewTriState.True;
            this.dataGridViewToCProperties.RowHeadersDefaultCellStyle = dataGridViewCellStyle6;
            this.dataGridViewToCProperties.Size = new System.Drawing.Size(243, 122);
            this.dataGridViewToCProperties.TabIndex = 8;
            // 
            // name
            // 
            this.name.HeaderText = "Name";
            this.name.Name = "name";
            // 
            // value
            // 
            this.value.HeaderText = "Value";
            this.value.Name = "value";
            // 
            // label32
            // 
            this.label32.AutoSize = true;
            this.label32.Dock = System.Windows.Forms.DockStyle.Top;
            this.label32.Location = new System.Drawing.Point(0, 0);
            this.label32.Name = "label32";
            this.label32.Size = new System.Drawing.Size(54, 13);
            this.label32.TabIndex = 0;
            this.label32.Text = "Properties";
            // 
            // panel8
            // 
            this.panel8.Controls.Add(this.textBoxToCBookmarkLabel);
            this.panel8.Controls.Add(this.label31);
            this.panel8.Dock = System.Windows.Forms.DockStyle.Top;
            this.panel8.Location = new System.Drawing.Point(0, 27);
            this.panel8.Name = "panel8";
            this.panel8.Size = new System.Drawing.Size(243, 34);
            this.panel8.TabIndex = 0;
            // 
            // textBoxToCBookmarkLabel
            // 
            this.textBoxToCBookmarkLabel.Dock = System.Windows.Forms.DockStyle.Top;
            this.textBoxToCBookmarkLabel.Location = new System.Drawing.Point(0, 13);
            this.textBoxToCBookmarkLabel.Name = "textBoxToCBookmarkLabel";
            this.textBoxToCBookmarkLabel.Size = new System.Drawing.Size(243, 20);
            this.textBoxToCBookmarkLabel.TabIndex = 17;
            this.textBoxToCBookmarkLabel.Text = "Table of Content";
            // 
            // label31
            // 
            this.label31.AutoSize = true;
            this.label31.Dock = System.Windows.Forms.DockStyle.Top;
            this.label31.Location = new System.Drawing.Point(0, 0);
            this.label31.Name = "label31";
            this.label31.Size = new System.Drawing.Size(107, 13);
            this.label31.TabIndex = 30;
            this.label31.Text = "ToC Bookmark Label";
            // 
            // panel4
            // 
            this.panel4.Controls.Add(this.radioButtonToCBack);
            this.panel4.Controls.Add(this.radioButtonToCFront);
            this.panel4.Controls.Add(this.label30);
            this.panel4.Dock = System.Windows.Forms.DockStyle.Top;
            this.panel4.Location = new System.Drawing.Point(0, 0);
            this.panel4.Name = "panel4";
            this.panel4.Padding = new System.Windows.Forms.Padding(0, 3, 0, 0);
            this.panel4.Size = new System.Drawing.Size(243, 27);
            this.panel4.TabIndex = 8;
            // 
            // radioButtonToCBack
            // 
            this.radioButtonToCBack.AutoSize = true;
            this.radioButtonToCBack.Location = new System.Drawing.Point(131, 5);
            this.radioButtonToCBack.Name = "radioButtonToCBack";
            this.radioButtonToCBack.Size = new System.Drawing.Size(50, 17);
            this.radioButtonToCBack.TabIndex = 19;
            this.radioButtonToCBack.TabStop = true;
            this.radioButtonToCBack.Text = "Back";
            this.radioButtonToCBack.UseVisualStyleBackColor = true;
            // 
            // radioButtonToCFront
            // 
            this.radioButtonToCFront.AutoSize = true;
            this.radioButtonToCFront.Location = new System.Drawing.Point(76, 5);
            this.radioButtonToCFront.Name = "radioButtonToCFront";
            this.radioButtonToCFront.Size = new System.Drawing.Size(49, 17);
            this.radioButtonToCFront.TabIndex = 18;
            this.radioButtonToCFront.TabStop = true;
            this.radioButtonToCFront.Text = "Front";
            this.radioButtonToCFront.UseVisualStyleBackColor = true;
            // 
            // label30
            // 
            this.label30.AutoSize = true;
            this.label30.Location = new System.Drawing.Point(0, 7);
            this.label30.Name = "label30";
            this.label30.Size = new System.Drawing.Size(74, 13);
            this.label30.TabIndex = 17;
            this.label30.Text = "ToC Location:";
            // 
            // panel2
            // 
            this.panel2.Dock = System.Windows.Forms.DockStyle.Top;
            this.panel2.Location = new System.Drawing.Point(0, 0);
            this.panel2.Name = "panel2";
            this.panel2.Size = new System.Drawing.Size(557, 3);
            this.panel2.TabIndex = 16;
            // 
            // tabPageConfigure
            // 
            this.tabPageConfigure.Controls.Add(this.label38);
            this.tabPageConfigure.Controls.Add(this.label37);
            this.tabPageConfigure.Controls.Add(this.textBoxWCFPassword);
            this.tabPageConfigure.Controls.Add(this.textBoxWCFUsername);
            this.tabPageConfigure.Controls.Add(this.label36);
            this.tabPageConfigure.Controls.Add(this.numericUpDownWCFMessageSize);
            this.tabPageConfigure.Controls.Add(this.label28);
            this.tabPageConfigure.Controls.Add(this.checkBoxVerboseLogging);
            this.tabPageConfigure.Controls.Add(this.label20);
            this.tabPageConfigure.Controls.Add(this.parallelConversions);
            this.tabPageConfigure.Controls.Add(this.label19);
            this.tabPageConfigure.Controls.Add(this.label13);
            this.tabPageConfigure.Controls.Add(this.textBoxServiceURL);
            this.tabPageConfigure.Controls.Add(this.buttonRequestConfiguration);
            this.tabPageConfigure.Location = new System.Drawing.Point(4, 22);
            this.tabPageConfigure.Name = "tabPageConfigure";
            this.tabPageConfigure.Padding = new System.Windows.Forms.Padding(3);
            this.tabPageConfigure.Size = new System.Drawing.Size(557, 217);
            this.tabPageConfigure.TabIndex = 1;
            this.tabPageConfigure.Text = "WS Configure";
            this.tabPageConfigure.UseVisualStyleBackColor = true;
            // 
            // label38
            // 
            this.label38.AutoSize = true;
            this.label38.Location = new System.Drawing.Point(344, 175);
            this.label38.Name = "label38";
            this.label38.Size = new System.Drawing.Size(56, 13);
            this.label38.TabIndex = 13;
            this.label38.Text = "Password:";
            // 
            // label37
            // 
            this.label37.AutoSize = true;
            this.label37.Location = new System.Drawing.Point(342, 150);
            this.label37.Name = "label37";
            this.label37.Size = new System.Drawing.Size(58, 13);
            this.label37.TabIndex = 13;
            this.label37.Text = "Username:";
            // 
            // textBoxWCFPassword
            // 
            this.textBoxWCFPassword.Location = new System.Drawing.Point(406, 172);
            this.textBoxWCFPassword.Name = "textBoxWCFPassword";
            this.textBoxWCFPassword.PasswordChar = '*';
            this.textBoxWCFPassword.Size = new System.Drawing.Size(100, 20);
            this.textBoxWCFPassword.TabIndex = 12;
            // 
            // textBoxWCFUsername
            // 
            this.textBoxWCFUsername.Location = new System.Drawing.Point(406, 147);
            this.textBoxWCFUsername.Name = "textBoxWCFUsername";
            this.textBoxWCFUsername.Size = new System.Drawing.Size(100, 20);
            this.textBoxWCFUsername.TabIndex = 11;
            // 
            // label36
            // 
            this.label36.AutoSize = true;
            this.label36.Location = new System.Drawing.Point(7, 150);
            this.label36.Name = "label36";
            this.label36.Size = new System.Drawing.Size(266, 13);
            this.label36.TabIndex = 10;
            this.label36.Text = "Credentials, if authentication is enabled on web service";
            // 
            // numericUpDownWCFMessageSize
            // 
            this.numericUpDownWCFMessageSize.Location = new System.Drawing.Point(406, 122);
            this.numericUpDownWCFMessageSize.Maximum = new decimal(new int[] {
            4096,
            0,
            0,
            0});
            this.numericUpDownWCFMessageSize.Minimum = new decimal(new int[] {
            1,
            0,
            0,
            0});
            this.numericUpDownWCFMessageSize.Name = "numericUpDownWCFMessageSize";
            this.numericUpDownWCFMessageSize.Size = new System.Drawing.Size(55, 20);
            this.numericUpDownWCFMessageSize.TabIndex = 9;
            this.numericUpDownWCFMessageSize.Value = new decimal(new int[] {
            250,
            0,
            0,
            0});
            // 
            // label28
            // 
            this.label28.AutoSize = true;
            this.label28.Location = new System.Drawing.Point(7, 125);
            this.label28.Name = "label28";
            this.label28.Size = new System.Drawing.Size(186, 13);
            this.label28.TabIndex = 8;
            this.label28.Text = "Maximum WCF Message Size (in MB):";
            // 
            // checkBoxVerboseLogging
            // 
            this.checkBoxVerboseLogging.AutoSize = true;
            this.checkBoxVerboseLogging.Checked = true;
            this.checkBoxVerboseLogging.CheckState = System.Windows.Forms.CheckState.Checked;
            this.checkBoxVerboseLogging.Location = new System.Drawing.Point(406, 100);
            this.checkBoxVerboseLogging.Name = "checkBoxVerboseLogging";
            this.checkBoxVerboseLogging.Size = new System.Drawing.Size(15, 14);
            this.checkBoxVerboseLogging.TabIndex = 4;
            this.checkBoxVerboseLogging.UseVisualStyleBackColor = true;
            // 
            // label20
            // 
            this.label20.AutoSize = true;
            this.label20.Location = new System.Drawing.Point(7, 100);
            this.label20.Name = "label20";
            this.label20.Size = new System.Drawing.Size(283, 13);
            this.label20.TabIndex = 6;
            this.label20.Text = "Verbose Logging (Please disable during performance tests)";
            // 
            // parallelConversions
            // 
            this.parallelConversions.Location = new System.Drawing.Point(406, 72);
            this.parallelConversions.Maximum = new decimal(new int[] {
            256,
            0,
            0,
            0});
            this.parallelConversions.Minimum = new decimal(new int[] {
            1,
            0,
            0,
            0});
            this.parallelConversions.Name = "parallelConversions";
            this.parallelConversions.Size = new System.Drawing.Size(55, 20);
            this.parallelConversions.TabIndex = 3;
            this.parallelConversions.Value = new decimal(new int[] {
            3,
            0,
            0,
            0});
            // 
            // label19
            // 
            this.label19.AutoSize = true;
            this.label19.Location = new System.Drawing.Point(7, 75);
            this.label19.Name = "label19";
            this.label19.Size = new System.Drawing.Size(394, 13);
            this.label19.TabIndex = 3;
            this.label19.Text = "Parallel Conversions to send to the server (Please update server settings to matc" +
    "h)";
            // 
            // label13
            // 
            this.label13.AutoSize = true;
            this.label13.Location = new System.Drawing.Point(7, 8);
            this.label13.Name = "label13";
            this.label13.Size = new System.Drawing.Size(71, 13);
            this.label13.TabIndex = 2;
            this.label13.Text = "Service URL:";
            // 
            // textBoxServiceURL
            // 
            this.textBoxServiceURL.Anchor = ((System.Windows.Forms.AnchorStyles)((((System.Windows.Forms.AnchorStyles.Top | System.Windows.Forms.AnchorStyles.Bottom) 
            | System.Windows.Forms.AnchorStyles.Left) 
            | System.Windows.Forms.AnchorStyles.Right)));
            this.textBoxServiceURL.Location = new System.Drawing.Point(84, 5);
            this.textBoxServiceURL.Name = "textBoxServiceURL";
            this.textBoxServiceURL.Size = new System.Drawing.Size(467, 20);
            this.textBoxServiceURL.TabIndex = 1;
            this.textBoxServiceURL.Text = "http://localhost:41734/Muhimbi.DocumentConverter.WebService/";
            // 
            // buttonRequestConfiguration
            // 
            this.buttonRequestConfiguration.Location = new System.Drawing.Point(7, 31);
            this.buttonRequestConfiguration.Name = "buttonRequestConfiguration";
            this.buttonRequestConfiguration.Size = new System.Drawing.Size(546, 24);
            this.buttonRequestConfiguration.TabIndex = 2;
            this.buttonRequestConfiguration.Text = "Request Configuration";
            this.buttonRequestConfiguration.UseVisualStyleBackColor = true;
            this.buttonRequestConfiguration.Click += new System.EventHandler(this.buttonRequestConfiguration_Click);
            // 
            // tabPageDiagnose
            // 
            this.tabPageDiagnose.Controls.Add(this.buttonRequestStatus);
            this.tabPageDiagnose.Controls.Add(this.buttonRequestDiagnostics);
            this.tabPageDiagnose.Location = new System.Drawing.Point(4, 22);
            this.tabPageDiagnose.Name = "tabPageDiagnose";
            this.tabPageDiagnose.Padding = new System.Windows.Forms.Padding(3);
            this.tabPageDiagnose.Size = new System.Drawing.Size(557, 217);
            this.tabPageDiagnose.TabIndex = 2;
            this.tabPageDiagnose.Text = "WS Diagnose";
            this.tabPageDiagnose.UseVisualStyleBackColor = true;
            // 
            // buttonRequestStatus
            // 
            this.buttonRequestStatus.Location = new System.Drawing.Point(6, 37);
            this.buttonRequestStatus.Name = "buttonRequestStatus";
            this.buttonRequestStatus.Size = new System.Drawing.Size(546, 24);
            this.buttonRequestStatus.TabIndex = 2;
            this.buttonRequestStatus.Text = "Request Service Status";
            this.buttonRequestStatus.UseVisualStyleBackColor = true;
            this.buttonRequestStatus.Click += new System.EventHandler(this.buttonRequestStatus_Click);
            // 
            // buttonRequestDiagnostics
            // 
            this.buttonRequestDiagnostics.Location = new System.Drawing.Point(6, 7);
            this.buttonRequestDiagnostics.Name = "buttonRequestDiagnostics";
            this.buttonRequestDiagnostics.Size = new System.Drawing.Size(546, 24);
            this.buttonRequestDiagnostics.TabIndex = 1;
            this.buttonRequestDiagnostics.Text = "Request Diagnostics";
            this.buttonRequestDiagnostics.UseVisualStyleBackColor = true;
            this.buttonRequestDiagnostics.Click += new System.EventHandler(this.buttonRequestDiagnostics_Click);
            // 
            // openFileDialog
            // 
            this.openFileDialog.FileName = "openFileDialog";
            // 
            // linkLabel
            // 
            this.linkLabel.Anchor = ((System.Windows.Forms.AnchorStyles)((System.Windows.Forms.AnchorStyles.Bottom | System.Windows.Forms.AnchorStyles.Left)));
            this.linkLabel.AutoSize = true;
            this.linkLabel.Location = new System.Drawing.Point(175, 599);
            this.linkLabel.Name = "linkLabel";
            this.linkLabel.Size = new System.Drawing.Size(143, 13);
            this.linkLabel.TabIndex = 27;
            this.linkLabel.TabStop = true;
            this.linkLabel.Text = "Open Troubleshooting Guide";
            this.linkLabel.LinkClicked += new System.Windows.Forms.LinkLabelLinkClickedEventHandler(this.linkLabel_LinkClicked);
            // 
            // linkLabelHowToUse
            // 
            this.linkLabelHowToUse.Anchor = ((System.Windows.Forms.AnchorStyles)((System.Windows.Forms.AnchorStyles.Bottom | System.Windows.Forms.AnchorStyles.Left)));
            this.linkLabelHowToUse.AutoSize = true;
            this.linkLabelHowToUse.Location = new System.Drawing.Point(361, 599);
            this.linkLabelHowToUse.Name = "linkLabelHowToUse";
            this.linkLabelHowToUse.Size = new System.Drawing.Size(100, 13);
            this.linkLabelHowToUse.TabIndex = 28;
            this.linkLabelHowToUse.TabStop = true;
            this.linkLabelHowToUse.Text = "How to use this tool";
            this.linkLabelHowToUse.LinkClicked += new System.Windows.Forms.LinkLabelLinkClickedEventHandler(this.linkLabelHowToUse_LinkClicked);
            // 
            // openFileDialogTemplate
            // 
            this.openFileDialogTemplate.FileName = "openFileDialogTemplate";
            this.openFileDialogTemplate.Filter = "InfoPath templates files|*.xsn|PDF Template|*.pdf";
            // 
            // TestForm
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(1034, 621);
            this.Controls.Add(this.linkLabelHowToUse);
            this.Controls.Add(this.linkLabel);
            this.Controls.Add(this.tabControl1);
            this.Controls.Add(this.labelThreadCount);
            this.Controls.Add(this.checkBoxShowConverted);
            this.Controls.Add(this.webBrowser);
            this.Controls.Add(this.textBoxDebug);
            this.Name = "TestForm";
            this.StartPosition = System.Windows.Forms.FormStartPosition.CenterScreen;
            this.Text = "Muhimbi Document Converter Diagnostics";
            this.Shown += new System.EventHandler(this.TestForm_Shown);
            this.groupBox1.ResumeLayout(false);
            this.groupBox1.PerformLayout();
            this.tabControl1.ResumeLayout(false);
            this.tabPageConversion.ResumeLayout(false);
            this.tabPageConversion.PerformLayout();
            this.tabControl2.ResumeLayout(false);
            this.tabPagePDFSecurity.ResumeLayout(false);
            this.tabPagePDFSecurity.PerformLayout();
            this.tabPage1.ResumeLayout(false);
            this.tabPage1.PerformLayout();
            this.groupBoxOCR.ResumeLayout(false);
            this.groupBoxOCR.PerformLayout();
            this.tabPagePDFViewerPreferences.ResumeLayout(false);
            this.tabPagePDFViewerPreferences.PerformLayout();
            this.tabPagePDFPostProcessing.ResumeLayout(false);
            this.tabPagePDFPostProcessing.PerformLayout();
            this.groupBoxPostProcess.ResumeLayout(false);
            this.groupBoxPostProcess.PerformLayout();
            this.tabPageMiscellaneous.ResumeLayout(false);
            this.tabPageMiscellaneous.PerformLayout();
            this.tabPageDocumentInformation.ResumeLayout(false);
            this.tabPageDocumentInformation.PerformLayout();
            ((System.ComponentModel.ISupportInitialize)(this.dataGridViewDocumentPropertySettings)).EndInit();
            this.tabPageHTML.ResumeLayout(false);
            this.tabPageHTML.PerformLayout();
            ((System.ComponentModel.ISupportInitialize)(this.numericUpDownConversionDelay)).EndInit();
            this.groupBox3.ResumeLayout(false);
            this.groupBox3.PerformLayout();
            this.groupBox2.ResumeLayout(false);
            this.groupBox2.PerformLayout();
            this.tabPageToC.ResumeLayout(false);
            this.tabPageToC.PerformLayout();
            this.tocGroupBox.ResumeLayout(false);
            this.panel1.ResumeLayout(false);
            this.panel1.PerformLayout();
            this.panel5.ResumeLayout(false);
            this.panel5.PerformLayout();
            this.panel3.ResumeLayout(false);
            this.panel9.ResumeLayout(false);
            this.panel9.PerformLayout();
            ((System.ComponentModel.ISupportInitialize)(this.dataGridViewToCProperties)).EndInit();
            this.panel8.ResumeLayout(false);
            this.panel8.PerformLayout();
            this.panel4.ResumeLayout(false);
            this.panel4.PerformLayout();
            this.tabPageConfigure.ResumeLayout(false);
            this.tabPageConfigure.PerformLayout();
            ((System.ComponentModel.ISupportInitialize)(this.numericUpDownWCFMessageSize)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.parallelConversions)).EndInit();
            this.tabPageDiagnose.ResumeLayout(false);
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        public System.Windows.Forms.Button buttonConvertFile;
        public System.Windows.Forms.TextBox textBoxDebug;
        public System.Windows.Forms.TextBox textBoxFileName;
        public System.Windows.Forms.Label label1;
        public System.Windows.Forms.TextBox textBoxPassword;
        public System.Windows.Forms.Label label2;
        public System.Windows.Forms.Label label3;
        public System.Windows.Forms.ComboBox comboBoxFormat;
        public System.Windows.Forms.ComboBox comboBoxQuality;
        public System.Windows.Forms.Label label4;
        public System.Windows.Forms.Label label6;
        public System.Windows.Forms.TextBox textBoxStartPage;
        public System.Windows.Forms.TextBox textBoxEndPage;
        public System.Windows.Forms.WebBrowser webBrowser;
        public System.Windows.Forms.ComboBox comboBoxBookmarks;
        public System.Windows.Forms.Label label5;
        public System.Windows.Forms.ComboBox comboBoxPDFProfile;
        public System.Windows.Forms.Label label8;
        public System.Windows.Forms.TextBox textBoxPDFOpenPassword;
        public System.Windows.Forms.TextBox textBoxPDFOwnerPassword;
        public System.Windows.Forms.Label label9;
        public System.Windows.Forms.CheckBox checkBoxDisableAnnotations;
        public System.Windows.Forms.CheckBox checkBoxDisableAccessibility;
        public System.Windows.Forms.GroupBox groupBox1;
        public System.Windows.Forms.CheckBox checkBoxDisableDocumentAssembly;
        public System.Windows.Forms.CheckBox checkBoxDisableCopyContent;
        public System.Windows.Forms.CheckBox checkBoxDisableFormFields;
        public System.Windows.Forms.CheckBox checkBoxDisablePrint;
        public System.Windows.Forms.CheckBox checkBoxDisableHighResolutionPrint;
        public System.Windows.Forms.Button buttonConvertFolder;
        public System.Windows.Forms.Label labelThreadCount;
        public System.Windows.Forms.CheckBox checkBoxShowConverted;
        public System.Windows.Forms.ComboBox comboBoxMacroSecurityOptions;
        public System.Windows.Forms.Label label10;
        public System.Windows.Forms.CheckBox checkBoxRefreshContent;
        public System.Windows.Forms.ComboBox comboBoxFidelity;
        public System.Windows.Forms.Label label11;
        public System.Windows.Forms.TabControl tabControl1;
        public System.Windows.Forms.TabPage tabPageConversion;
        public System.Windows.Forms.TabPage tabPageConfigure;
        public System.Windows.Forms.Button buttonRequestConfiguration;
        public System.Windows.Forms.TabPage tabPageDiagnose;
        public System.Windows.Forms.ComboBox comboBoxRange;
        public System.Windows.Forms.Label label12;
        public System.Windows.Forms.Button buttonRequestDiagnostics;
        public System.Windows.Forms.Label label13;
        public System.Windows.Forms.TextBox textBoxServiceURL;
        public System.Windows.Forms.OpenFileDialog openFileDialog;
        public System.Windows.Forms.Button buttonBrowse;
        public System.Windows.Forms.CheckBox checkBoxIncludeSampleWatermarks;
        public System.Windows.Forms.Label label14;
        public System.Windows.Forms.ComboBox comboBoxPageOrientation;
        public System.Windows.Forms.TabPage tabPageHTML;
        public System.Windows.Forms.Button buttonConvertURL;
        public System.Windows.Forms.TextBox textBoxHTMLCode;
        public System.Windows.Forms.Button buttonConvertHTML;
        public System.Windows.Forms.TextBox textBoxHTMLurl;
        public System.Windows.Forms.Label label18;
        public System.Windows.Forms.Label label17;
        public System.Windows.Forms.TextBox textBoxHTMLPassword;
        public System.Windows.Forms.TextBox textBoxHTMLUserName;
        public System.Windows.Forms.LinkLabel linkLabel;
        public System.Windows.Forms.Button buttonMergeFolder;
        public System.Windows.Forms.NumericUpDown parallelConversions;
        public System.Windows.Forms.Label label19;
        public System.Windows.Forms.Label label20;
        public System.Windows.Forms.CheckBox checkBoxVerboseLogging;
        public System.Windows.Forms.TabControl tabControl2;
        public System.Windows.Forms.TabPage tabPagePDFSecurity;
        public System.Windows.Forms.TabPage tabPagePDFViewerPreferences;
        public System.Windows.Forms.TabPage tabPagePDFPostProcessing;
        public System.Windows.Forms.TabPage tabPageMiscellaneous;
        public System.Windows.Forms.CheckBox checkBoxEmbedAllFonts;
        public System.Windows.Forms.CheckBox checkBoxEnableFastWebView;
        public System.Windows.Forms.CheckBox checkBoxPostProcessFile;
        public System.Windows.Forms.CheckBox checkBoxSubsetFonts;
        public System.Windows.Forms.GroupBox groupBoxPostProcess;
        public System.Windows.Forms.CheckBox checkBoxCenterWindow;
        public System.Windows.Forms.CheckBox checkBoxDisplayTitle;
        public System.Windows.Forms.CheckBox checkBoxFitWindow;
        public System.Windows.Forms.CheckBox checkBoxHideMenubar;
        public System.Windows.Forms.CheckBox checkBoxHideToolbar;
        public System.Windows.Forms.CheckBox checkBoxHideWindowUI;
        public System.Windows.Forms.CheckBox checkBoxHideEmptyNavigationPane;
        public System.Windows.Forms.CheckBox checkBoxFullScreen;
        public System.Windows.Forms.ComboBox comboBoxPageLayout;
        public System.Windows.Forms.Label label7;
        public System.Windows.Forms.ComboBox comboBoxNavigationPane;
        public System.Windows.Forms.Label label21;
        public System.Windows.Forms.ComboBox comboBoxPageScalingMode;
        public System.Windows.Forms.Label label22;
        public System.Windows.Forms.CheckBox checkBoxDisableDocumentSecurity;
        private System.Windows.Forms.TabPage tabPage1;
        private System.Windows.Forms.Label label23;
        private System.Windows.Forms.Label label24;
        private System.Windows.Forms.Label label26;
        private System.Windows.Forms.Label label25;
        private System.Windows.Forms.GroupBox groupBoxOCR;
        private System.Windows.Forms.Label label27;
        public System.Windows.Forms.CheckBox checkBoxPerformOCR;
        public System.Windows.Forms.ComboBox comboBoxOCRLanguage;
        public System.Windows.Forms.ComboBox comboBoxOCRPerformance;
        public System.Windows.Forms.CheckBox checkBoxOCRPaginate;
        public System.Windows.Forms.TextBox textBoxOCRWhiteList;
        public System.Windows.Forms.TextBox textBoxOCRBlackList;
        public System.Windows.Forms.TextBox textBoxOCRRegions;
        public System.Windows.Forms.Label label28;
        public System.Windows.Forms.NumericUpDown numericUpDownWCFMessageSize;
        public System.Windows.Forms.LinkLabel linkLabelHowToUse;
        public System.Windows.Forms.CheckBox checkBoxOCRRetrieveTextOnly;
        private System.Windows.Forms.TabPage tabPageToC;
        private System.Windows.Forms.GroupBox tocGroupBox;
        private System.Windows.Forms.Panel panel2;
        private System.Windows.Forms.Panel panel3;
        private System.Windows.Forms.DataGridViewTextBoxColumn name;
        private System.Windows.Forms.DataGridViewTextBoxColumn value;
        private System.Windows.Forms.Panel panel4;
        private System.Windows.Forms.Label label30;
        private System.Windows.Forms.Panel panel1;
        private System.Windows.Forms.Panel panel5;
        private System.Windows.Forms.Label label29;
        private System.Windows.Forms.Button buttonLoadTocTemplate;
        private System.Windows.Forms.Panel panel6;
        private System.Windows.Forms.Label label31;
        private System.Windows.Forms.Panel panel9;
        private System.Windows.Forms.Label label32;
        private System.Windows.Forms.Panel panel8;
        public System.Windows.Forms.CheckBox checkBoxEnableToC;
        public System.Windows.Forms.RadioButton radioButtonToCBack;
        public System.Windows.Forms.RadioButton radioButtonToCFront;
        public System.Windows.Forms.TextBox textBoxToCBookmarkLabel;
        public System.Windows.Forms.DataGridView dataGridViewToCProperties;
        public System.Windows.Forms.TextBox textBoxToCTemplate;
        public System.Windows.Forms.Label label34;
        public System.Windows.Forms.Label label33;
        public System.Windows.Forms.ComboBox comboBoxAuthenticationMode;
        public System.Windows.Forms.ComboBox comboBoxHtmlRenderingEngine;
        public System.Windows.Forms.ComboBox comboBoxMediaType;
        public System.Windows.Forms.Label label35;
        private System.Windows.Forms.GroupBox groupBox3;
        private System.Windows.Forms.GroupBox groupBox2;
        public System.Windows.Forms.Label label15;
        public System.Windows.Forms.Label label16;
        public System.Windows.Forms.NumericUpDown numericUpDownConversionDelay;
        public System.Windows.Forms.Button buttonRequestStatus;
        private System.Windows.Forms.Label label38;
        private System.Windows.Forms.Label label37;
        private System.Windows.Forms.TextBox textBoxWCFPassword;
        private System.Windows.Forms.TextBox textBoxWCFUsername;
        private System.Windows.Forms.Label label36;
        private System.Windows.Forms.Button buttonGetDocumentProperties;
        public System.Windows.Forms.TextBox textBoxTemplateFile;
        public System.Windows.Forms.TextBox textBoxTemplatePassword;
        public System.Windows.Forms.TextBox textBoxTemplateUsername;
        public System.Windows.Forms.Button buttonBrowseTemplate;
        public System.Windows.Forms.Label label39;
        public System.Windows.Forms.OpenFileDialog openFileDialogTemplate;
        public System.Windows.Forms.Label label41;
        public System.Windows.Forms.Label label40;
        private System.Windows.Forms.Label label42;
        private System.Windows.Forms.TabPage tabPageDocumentInformation;
        private System.Windows.Forms.Button buttonAddDocProperty;
        private System.Windows.Forms.DataGridView dataGridViewDocumentPropertySettings;
        public System.Windows.Forms.CheckBox checkBoxGetDocPropertyiesIgnoreErros;
    }
}

