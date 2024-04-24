<?xml version="1.0" encoding="UTF-8"?>

<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">

<xsl:template match="/">
    <html>
        <head>
            <title>Museos de Florencia</title>
            <style>
                *{
                    text-align: center;
                }
            </style>
        </head>
        <body>
            <h1>Museos de Florencia</h1>
                <table border="1" align="center">
                    <tr>
                        <th>Museo</th>
                        <th>Siglo Construccion</th>
                        <th>Arquitecto</th>
                    </tr>
                    <xsl:for-each select="museos/museo">
                        <tr>
                            <td><xsl:value-of select="@nombre"/></td>
                            <td><xsl:value-of select="construccion"/></td>
                            <td><xsl:value-of select="arquitecto"/></td>
                            
                        </tr>
                    </xsl:for-each>

                </table>
        </body>
    </html>
</xsl:template>
</xsl:stylesheet>