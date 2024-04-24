<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:template match="/">
        <html>
            <head>
                <title>Transformación XSLT</title>
            </head>
            <body>
    
              
                <xsl:for-each select="ies/ciclos/ciclo">
                   
                  <p>  <xsl:value-of select="nombre"/></p>
                </xsl:for-each>
                <br></br>
                <xsl:template match="/">
    <ul>
        <xsl:for-each select="ies/ciclos/ciclo">
            <li><xsl:value-of select="nombre"/> (<xsl:value-of select="grado"/>)</li>
        </xsl:for-each>
    </ul>
</xsl:template>

            </body>
        </html>
    </xsl:template>


</xsl:stylesheet>
