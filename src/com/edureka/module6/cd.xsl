<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform">

	<xsl:template match="/">
		<html>
			<body>
				<h2>My CD Collection</h2>
				<table border="1">
					<tr bgcolor="#9acd32">
						<th style="text-align:left">Title</th>
						<th style="text-align:left">Artist</th>
						<th style="text-align:left">Company</th>
						<th style="text-align:left">Year</th>
					</tr>
					<xsl:for-each select="catalog/cd">
						<tr>
							<td>
								<xsl:value-of select="title" />
							</td>
							<td>
								<xsl:value-of select="artist" />
							</td>
							<td>
								<xsl:value-of select="company" />
							</td>
							<td>
								<xsl:choose>
									<xsl:when test="./year = '1985'">
										<span style="background-color: red; color:black">
											<xsl:value-of select="year" />
										</span>
									</xsl:when>
									<xsl:when test="./year = '1982'">
										<span style="background-color: blue; color:black">
											<xsl:value-of select="year" />
										</span>
									</xsl:when>
									<xsl:otherwise>
										<span style="background-color: pink; color:black">
											<xsl:value-of select="year" />
										</span>
									</xsl:otherwise>
								</xsl:choose>

							</td>
						</tr>
					</xsl:for-each>
				</table>
			</body>
		</html>
	</xsl:template>
</xsl:stylesheet>
