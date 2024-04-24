<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:template match="/">
        <html>
            <head>

                <link rel="stylesheet" type="text/css" href="mystyle.css"/>
                
                <title>Carteleras</title>
                <h1>CITAS HUMORISTICAS</h1>
            </head>
            <body>
                    
                    <xsl:for-each select="citas/cita">
                        <div class="chico">
                            <div class="fa"> <p><strong><xsl:value-of select="autor"/></strong>
                               <xsl:value-of select="fechas"/></p></div>
                            <div class="t">    <p><xsl:value-of select="texto"/></p></div>
                            
                        </div>
                    </xsl:for-each>
                
            </body>
        </html>
    </xsl:template>
</xsl:stylesheet>
