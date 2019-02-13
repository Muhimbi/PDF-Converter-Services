<?xml version="1.0" encoding="utf-8"?>
<xsl:stylesheet version="1.0"
                xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
                xmlns:msxsl="urn:schemas-microsoft-com:xslt"
                exclude-result-prefixes="msxsl">

  <xsl:output method="html" indent="yes"/>

  <xsl:template match="/toc">
    <html>
      <head>
        <style type="text/css">
          ul.toc
          {
            margin: 0;
            padding: 0;
            list-style: none;
          }

          ol.toc
          {
            margin: 0;
            padding: 0;
            margin-left: 10px;
            list-style: none;
          }

          ul.toc li, ol.toc li
          {
            list-style: none;
            overflow: hidden;
          }

          .bookmark-container
          {
            position: relative;
            width: 100%;
          }

          .bookmark-container table
          {
            width: 100%;
            display: inline-table;
            border-collapse: collapse;
          }

          .bookmark-container td
          {
            padding:0;
          }

          td.page
          {
            vertical-align: bottom;
            text-align: right;
          }

          a.toc
          {
            text-decoration: none;
            color: #000;
          }

          span.title
          {
            background-color: white;
            padding-right: 4px;
          }

          span.page
          {
            text-align: right;
            padding-left: 4px;
            background-color: white;
          }

          .dots
          {
            width: 100%;
            height: 2px;
            position: absolute;
            bottom: 5px;
            border-bottom: 2px dotted black;
            z-index: -1;
          }

        </style>
      </head>
      <body>
        <h1>
          <xsl:value-of select="properties/property[@name='title']"/>
        </h1>
        <br/>
        <br/>
        <xsl:apply-templates/>
      </body>
    </html>
  </xsl:template>

  <xsl:template match="topics">
    <ul class="toc">
      <xsl:apply-templates/>
    </ul>
  </xsl:template>

  <!-- Empty template so properties are not appearing -->
  <xsl:template match="properties"></xsl:template>

  <xsl:template match="topic[@level='0']">
    <li>
      <div class="bookmark-container">
        <table>
          <tr>
            <td>
              <span class="title" style="font-weight: 900;">
                <xsl:element name="a">
                  <xsl:attribute name="href">
                    <xsl:value-of select="@target"/>
                  </xsl:attribute>
                  <xsl:attribute name="class">toc</xsl:attribute>
                  <xsl:value-of select="@title"/>
                </xsl:element>
              </span>
            </td>
            <td class="page">
              <span class="page">
                <xsl:element name="a">
                  <xsl:attribute name="href">
                    <xsl:value-of select="@target"/>
                  </xsl:attribute>
                  <xsl:attribute name="class">toc</xsl:attribute>
                  <xsl:value-of select="@page"/>
                </xsl:element>
              </span>
            </td>
          </tr>
        </table>
        <div class="dots" style=""></div>
      </div>
    </li>
    <ol class="toc">
      <xsl:apply-templates/>
    </ol>
  </xsl:template>

  <xsl:template match="topic">
    <li>
      <div class="bookmark-container">
        <table>
          <tr>
            <td>
              <span class="title">
                <xsl:element name="a">
                  <xsl:attribute name="href">
                    <xsl:value-of select="@target"/>
                  </xsl:attribute>
                  <xsl:attribute name="class">toc</xsl:attribute>
                  <xsl:value-of select="@title"/>
                </xsl:element>
              </span>
            </td>
            <td class="page">
              <span class="page">
                <xsl:element name="a">
                  <xsl:attribute name="href">
                    <xsl:value-of select="@target"/>
                  </xsl:attribute>
                  <xsl:attribute name="class">toc</xsl:attribute>
                  <xsl:value-of select="@page"/>
                </xsl:element>
              </span>
            </td>
          </tr>
        </table>
        <div class="dots" style=""></div>
      </div>
    </li>
    <ol class="toc">
      <xsl:apply-templates/>
    </ol>
  </xsl:template>

</xsl:stylesheet>
