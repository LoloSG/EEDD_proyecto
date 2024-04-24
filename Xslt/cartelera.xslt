<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:template match="/">
        <html>
            <head>
                <title>Carteleras</title>
            </head>
            <body>
                <h2>Cartelera de Cine</h2>
                <table border="1">
                    <tr>
                        <th>Película</th>
                        <th>Horario</th>
                        <th>Género</th>
                        <th>Director</th>
                    </tr>
                    <xsl:for-each select="cartelera/pelicula">
                        <tr>
                            <td><xsl:value-of select="nombre"/></td>
                            <td><xsl:value-of select="horario"/></td>
                            <td><xsl:value-of select="genero"/></td>
                            <td><xsl:value-of select="director"/></td>
                        </tr>
                    </xsl:for-each>
                </table>
            </body>
        </html>
    </xsl:template>
</xsl:stylesheet>


<!-- <xsl:for-each select="cartelera/pelicula[nombre='El padrino']"> por la pelicula que queramos seleccionar en todo caso
<xsl:sort select="Director"> para ordenar por director
<td><xsl:wolve-of select="nombre></td>
<xsl:if test="Precio <5"-->