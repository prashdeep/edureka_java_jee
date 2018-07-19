<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
	<xsl:template match="/">
		<html>
			<body>
				<h1>Company details</h1>
				
				  <h2><span style="background-color:red; padding:10px;"><xsl:value-of select="company/name"></xsl:value-of></span></h2>
				<xsl:for-each select="company/employees/employee">
				  <h2><span  style="background-color:green; padding:20px"><xsl:value-of select="id"></xsl:value-of></span></h2>
				  <h2 style="background-color:blue:padding:20px;"><xsl:value-of select="name"></xsl:value-of></h2>
				</xsl:for-each>
			</body>
		</html>
	</xsl:template>
</xsl:stylesheet>
