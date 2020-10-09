<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
	<xsl:template match="/">
		<html>
			<body>
				<h1>My CD Collection</h1>
				<table border="1">
					<tr bgcolor="red">
						<th style="text-align:left">Title</th>
						<th style="text-align:left">Artist</th>
						<th style="text-align:left">Company</th>
						<th style="text-align:left">Price</th>
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
									<xsl:when test="year &gt;= '1985'">
										<span style="background-color: green; color:white">
											<xsl:value-of select="year" />
										</span>
									</xsl:when>
									<xsl:when test="year &lt;=  '1982'">
										<span style="background-color: tomato; color:black">
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
							<td>
							<xsl:choose>
								<xsl:when test="price &gt;=10.00">
								<span style="background-color: tomato; color:black">
									<xsl:value-of select="price"/>
								</span>
								</xsl:when>
								<xsl:otherwise>
										<span style="background-color: pink; color:black">
											<xsl:value-of select="price" />
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
