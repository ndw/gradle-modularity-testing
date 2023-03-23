<?xml version="1.0" encoding="utf-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
                xmlns:xs="http://www.w3.org/2001/XMLSchema"
                exclude-result-prefixes="xs"
                version="3.0">

<xsl:output method="xml" encoding="utf-8" indent="no"/>

<xsl:param name="message" select="'Hello, world.'"/>

<xsl:template name="xsl:initial-template">
  <doc>
    <xsl:sequence select="$message"/>
  </doc>
</xsl:template>

</xsl:stylesheet>
