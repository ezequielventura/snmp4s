package org.snmp4s.gen

/**
  * MIBs that are built into this library, thanks to Mibble.
  * 
  */

// Generated by extracting the mibble mibs jar and executing:
// ls | nawk -F"-" '{print "val " substr($1,1,1) tolower(substr($1,2)) substr($2,1,1) tolower(substr($2,2)) substr($3,1,1) tolower(substr($3,2)) substr($4,1,1) tolower(substr($4,2)) substr($5,1,1) tolower(substr($5,2)) substr($6,1,1) tolower(substr($6,2)) " = \"" $0 "\""}'
object BuiltIn {
  val IanaAddressFamilyNumbersMib = "IANA-ADDRESS-FAMILY-NUMBERS-MIB"
  val IanaCharsetMib = "IANA-CHARSET-MIB"
  val IanaFinisherMib = "IANA-FINISHER-MIB"
  val IanaGmplsTcMib = "IANA-GMPLS-TC-MIB"
  val IanaIppmMetricsRegistryMib = "IANA-IPPM-METRICS-REGISTRY-MIB"
  val IanaLanguageMib = "IANA-LANGUAGE-MIB"
  val IanaMallocMib = "IANA-MALLOC-MIB"
  val IanaMauMib = "IANA-MAU-MIB"
  val IanaPrinterMib = "IANA-PRINTER-MIB"
  val IanaRtprotoMib = "IANA-RTPROTO-MIB"
  val IanaIfTypeMib = "IANAifType-MIB"
  val IanaTn3270eTc = "IANATn3270eTC-MIB"
  val AccountingControlMib = "ACCOUNTING-CONTROL-MIB"
  val Adsl2LineMib = "ADSL2-LINE-MIB"
  val Adsl2LineTcMib = "ADSL2-LINE-TC-MIB"
  val AdslLineExtMib = "ADSL-LINE-EXT-MIB"
  val AdslLineMib = "ADSL-LINE-MIB"
  val AdslTcMib = "ADSL-TC-MIB"
  val AgentxMib = "AGENTX-MIB"
  val AggregateMib = "AGGREGATE-MIB"
  val AlarmMib = "ALARM-MIB"
  val ApmMib = "APM-MIB"
  val AppcMib = "APPC-MIB"
  val AppletalkMib = "APPLETALK-MIB"
  val ApplicationMib = "APPLICATION-MIB"
  val AppnDlurMib = "APPN-DLUR-MIB"
  val AppnMib = "APPN-MIB"
  val AppnTrapMib = "APPN-TRAP-MIB"
  val ApsMib = "APS-MIB"
  val ArcMib = "ARC-MIB"
  val Atm2Mib = "ATM2-MIB"
  val AtmAccountingInformationMib = "ATM-ACCOUNTING-INFORMATION-MIB"
  val AtmMib = "ATM-MIB"
  val AtmTcMib = "ATM-TC-MIB"
  val Bgp4Mib = "BGP4-MIB"
  val BldgHvacMib = "BLDG-HVAC-MIB"
  val BridgeMib = "BRIDGE-MIB"
  val CharacterMib = "CHARACTER-MIB"
  val CircuitIfMib = "CIRCUIT-IF-MIB"
  val ClnsMib = "CLNS-MIB"
  val CoffeePotMib = "COFFEE-POT-MIB"
  val CopsClientMib = "COPS-CLIENT-MIB"
  val DecnetPhivMib = "DECNET-PHIV-MIB"
  val DialControlMib = "DIAL-CONTROL-MIB"
  val DiffservConfigMib = "DIFFSERV-CONFIG-MIB"
  val DiffservDscpTc = "DIFFSERV-DSCP-TC"
  val DiffservMib = "DIFFSERV-MIB"
  val DirectoryServerMib = "DIRECTORY-SERVER-MIB"
  val DismanEventMib = "DISMAN-EVENT-MIB"
  val DismanExpressionMib = "DISMAN-EXPRESSION-MIB"
  val DismanNslookupMib = "DISMAN-NSLOOKUP-MIB"
  val DismanPingMib = "DISMAN-PING-MIB"
  val DismanScheduleMib = "DISMAN-SCHEDULE-MIB"
  val DismanScriptMib = "DISMAN-SCRIPT-MIB"
  val DismanTracerouteMib = "DISMAN-TRACEROUTE-MIB"
  val DlswMib = "DLSW-MIB"
  val DnsResolverMib = "DNS-RESOLVER-MIB"
  val DnsServerMib = "DNS-SERVER-MIB"
  val DocsBpiMib = "DOCS-BPI-MIB"
  val DocsCableDeviceMib = "DOCS-CABLE-DEVICE-MIB"
  val DocsIetfBpi2Mib = "DOCS-IETF-BPI2-MIB"
  val DocsIetfCableDeviceNotificationMib = "DOCS-IETF-CABLE-DEVICE-NOTIFICATION-MIB"
  val DocsIetfQosMib = "DOCS-IETF-QOS-MIB"
  val DocsIetfSubmgtMib = "DOCS-IETF-SUBMGT-MIB"
  val DocsIfMib = "DOCS-IF-MIB"
  val Dot12IfMib = "DOT12-IF-MIB"
  val Dot12RptrMib = "DOT12-RPTR-MIB"
  val Dot3EponMib = "DOT3-EPON-MIB"
  val Dot3OamMib = "DOT3-OAM-MIB"
  val Ds0bundleMib = "DS0BUNDLE-MIB"
  val Ds0Mib = "DS0-MIB"
  val Ds1Mib = "DS1-MIB"
  val Ds3Mib = "DS3-MIB"
  val DsaMib = "DSA-MIB"
  val DsmonMib = "DSMON-MIB"
  val EbnMib = "EBN-MIB"
  val EfmCuMib = "EFM-CU-MIB"
  val EntityMib = "ENTITY-MIB"
  val EntitySensorMib = "ENTITY-SENSOR-MIB"
  val EntityStateMib = "ENTITY-STATE-MIB"
  val EntityStateTcMib = "ENTITY-STATE-TC-MIB"
  val EtherChipsetMib = "ETHER-CHIPSET-MIB"
  val EtherlikeMib = "EtherLike-MIB"
  val EtherWis = "ETHER-WIS"
  val FcipMgmtMib = "FCIP-MGMT-MIB"
  val FcMgmtMib = "FC-MGMT-MIB"
  val FddiSmt73Mib = "FDDI-SMT73-MIB"
  val FibreChannelFeMib = "FIBRE-CHANNEL-FE-MIB"
  val FinisherMib = "Finisher-MIB"
  val FlowMeterMib = "FLOW-METER-MIB"
  val FrameRelayDteMib = "FRAME-RELAY-DTE-MIB"
  val FrAtmPvcServiceIwfMib = "FR-ATM-PVC-SERVICE-IWF-MIB"
  val FrMfrMib = "FR-MFR-MIB"
  val FrnetservMib = "FRNETSERV-MIB"
  val FrsldMib = "FRSLD-MIB"
  val GmplsLabelStdMib = "GMPLS-LABEL-STD-MIB"
  val GmplsLsrStdMib = "GMPLS-LSR-STD-MIB"
  val GmplsTcStdMib = "GMPLS-TC-STD-MIB"
  val GmplsTeStdMib = "GMPLS-TE-STD-MIB"
  val GsmpMib = "GSMP-MIB"
  val HcAlarmMib = "HC-ALARM-MIB"
  val HcnumTc = "HCNUM-TC"
  val HcPerfhistTcMib = "HC-PerfHist-TC-MIB"
  val HcRmonMib = "HC-RMON-MIB"
  val Hdsl2ShdslLineMib = "HDSL2-SHDSL-LINE-MIB"
  val HostResourcesMib = "HOST-RESOURCES-MIB"
  val HostResourcesTypes = "HOST-RESOURCES-TYPES"
  val HprIpMib = "HPR-IP-MIB"
  val HprMib = "HPR-MIB"
  val IanaItuAlarmTcMib = "IANA-ITU-ALARM-TC-MIB"
  val IfCapStackMib = "IF-CAP-STACK-MIB"
  val IfcpMgmtMib = "IFCP-MGMT-MIB"
  val IfInvertedStackMib = "IF-INVERTED-STACK-MIB"
  val IfMib = "IF-MIB"
  val IgmpStdMib = "IGMP-STD-MIB"
  val InetAddressMib = "INET-ADDRESS-MIB"
  val IntegratedServicesGuaranteedMib = "INTEGRATED-SERVICES-GUARANTEED-MIB"
  val IntegratedServicesMib = "INTEGRATED-SERVICES-MIB"
  val InterfacetopnMib = "INTERFACETOPN-MIB"
  val IpatmIpmcMib = "IPATM-IPMC-MIB"
  val IpForwardMib = "IP-FORWARD-MIB"
  val IpmcastMib = "IPMCAST-MIB"
  val IpMib = "IP-MIB"
  val IpmrouteStdMib = "IPMROUTE-STD-MIB"
  val IpoaMib = "IPOA-MIB"
  val IpsAuthMib = "IPS-AUTH-MIB"
  val IpsecSpdMib = "IPSEC-SPD-MIB"
  val Ipv6FlowLabelMib = "IPV6-FLOW-LABEL-MIB"
  val Ipv6IcmpMib = "IPV6-ICMP-MIB"
  val Ipv6Mib = "IPV6-MIB"
  val Ipv6MldMib = "IPV6-MLD-MIB"
  val Ipv6Tc = "IPV6-TC"
  val Ipv6TcpMib = "IPV6-TCP-MIB"
  val Ipv6UdpMib = "IPV6-UDP-MIB"
  val IscsiMib = "ISCSI-MIB"
  val IsdnMib = "ISDN-MIB"
  val IsisMib = "ISIS-MIB"
  val IsnsMib = "ISNS-MIB"
  val ItuAlarmMib = "ITU-ALARM-MIB"
  val ItuAlarmTcMib = "ITU-ALARM-TC-MIB"
  val JobMonitoringMib = "Job-Monitoring-MIB"
  val L2tpMib = "L2TP-MIB"
  val LangtagTcMib = "LANGTAG-TC-MIB"
  val LmpMib = "LMP-MIB"
  val MallocMib = "MALLOC-MIB"
  val MauMib = "MAU-MIB"
  val MidcomMib = "MIDCOM-MIB"
  val Miox25Mib = "MIOX25-MIB"
  val MipMib = "MIP-MIB"
  val Mobileipv6Mib = "MOBILEIPV6-MIB"
  val ModemMib = "Modem-MIB"
  val MplsFtnStdMib = "MPLS-FTN-STD-MIB"
  val MplsL3vpnStdMib = "MPLS-L3VPN-STD-MIB"
  val MplsLcAtmStdMib = "MPLS-LC-ATM-STD-MIB"
  val MplsLcFrStdMib = "MPLS-LC-FR-STD-MIB"
  val MplsLdpAtmStdMib = "MPLS-LDP-ATM-STD-MIB"
  val MplsLdpFrameRelayStdMib = "MPLS-LDP-FRAME-RELAY-STD-MIB"
  val MplsLdpGenericStdMib = "MPLS-LDP-GENERIC-STD-MIB"
  val MplsLdpStdMib = "MPLS-LDP-STD-MIB"
  val MplsLsrStdMib = "MPLS-LSR-STD-MIB"
  val MplsTcStdMib = "MPLS-TC-STD-MIB"
  val MplsTeStdMib = "MPLS-TE-STD-MIB"
  val MsdpMib = "MSDP-MIB"
  val MtaMib = "MTA-MIB"
  val NatMib = "NAT-MIB"
  val NetworkServicesMib = "NETWORK-SERVICES-MIB"
  val NhrpMib = "NHRP-MIB"
  val NotificationLogMib = "NOTIFICATION-LOG-MIB"
  val OptIfMib = "OPT-IF-MIB"
  val OspfMib = "OSPF-MIB"
  val OspfTrapMib = "OSPF-TRAP-MIB"
  val ParallelMib = "PARALLEL-MIB"
  val PBridgeMib = "P-BRIDGE-MIB"
  val PerfhistTcMib = "PerfHist-TC-MIB"
  val PimMib = "PIM-MIB"
  val PimStdMib = "PIM-STD-MIB"
  val PintMib = "PINT-MIB"
  val PktcIetfMtaMib = "PKTC-IETF-MTA-MIB"
  val PktcIetfSigMib = "PKTC-IETF-SIG-MIB"
  val PolicyBasedManagementMib = "POLICY-BASED-MANAGEMENT-MIB"
  val PowerEthernetMib = "POWER-ETHERNET-MIB"
  val PppBridgeNcpMib = "PPP-BRIDGE-NCP-MIB"
  val PppIpNcpMib = "PPP-IP-NCP-MIB"
  val PppLcpMib = "PPP-LCP-MIB"
  val PppSecMib = "PPP-SEC-MIB"
  val PrinterMib = "Printer-MIB"
  val PtopoMib = "PTOPO-MIB"
  val QBridgeMib = "Q-BRIDGE-MIB"
  val RadiusAccClientMib = "RADIUS-ACC-CLIENT-MIB"
  val RadiusAccServerMib = "RADIUS-ACC-SERVER-MIB"
  val RadiusAuthClientMib = "RADIUS-AUTH-CLIENT-MIB"
  val RadiusAuthServerMib = "RADIUS-AUTH-SERVER-MIB"
  val RadiusDynauthClientMib = "RADIUS-DYNAUTH-CLIENT-MIB"
  val RadiusDynauthServerMib = "RADIUS-DYNAUTH-SERVER-MIB"
  val RaqmonMib = "RAQMON-MIB"
  val RdbmsMib = "RDBMS-MIB"
  val Rfc1065Smi = "RFC1065-SMI"
  val Rfc1155Smi = "RFC1155-SMI"
  val Rfc1158Mib = "RFC1158-MIB"
  val Rfc1212 = "RFC-1212"
  val Rfc1213Mib = "RFC1213-MIB"
  val Rfc1215 = "RFC-1215"
  val Rfc1229Mib = "RFC1229-MIB"
  val Rfc1231Mib = "RFC1231-MIB"
  val Rfc1243Mib = "RFC1243-MIB"
  val Rfc1253Mib = "RFC1253-MIB"
  val Rfc1269Mib = "RFC1269-MIB"
  val Rfc1271Mib = "RFC1271-MIB"
  val Rfc1285Mib = "RFC1285-MIB"
  val Rfc1315Mib = "RFC1315-MIB"
  val Rfc1316Mib = "RFC1316-MIB"
  val Rfc1381Mib = "RFC1381-MIB"
  val Rfc1382Mib = "RFC1382-MIB"
  val Rfc1398Mib = "RFC1398-MIB"
  val Rfc1406Mib = "RFC1406-MIB"
  val Rfc1407Mib = "RFC1407-MIB"
  val Rfc1414Mib = "RFC1414-MIB"
  val Ripv2Mib = "RIPv2-MIB"
  val Rmon2Mib = "RMON2-MIB"
  val RmonMib = "RMON-MIB"
  val RohcMib = "ROHC-MIB"
  val RohcRtpMib = "ROHC-RTP-MIB"
  val RohcUncompressedMib = "ROHC-UNCOMPRESSED-MIB"
  val Rs232Mib = "RS-232-MIB"
  val RstpMib = "RSTP-MIB"
  val RsvpMib = "RSVP-MIB"
  val RtpMib = "RTP-MIB"
  val ScsiMib = "SCSI-MIB"
  val SctpMib = "SCTP-MIB"
  val SflowMib = "SFLOW-MIB"
  val SipCommonMib = "SIP-COMMON-MIB"
  val SipMib = "SIP-MIB"
  val SipServerMib = "SIP-SERVER-MIB"
  val SipTcMib = "SIP-TC-MIB"
  val SipUaMib = "SIP-UA-MIB"
  val SlapmMib = "SLAPM-MIB"
  val SmonMib = "SMON-MIB"
  val SnaNauMib = "SNA-NAU-MIB"
  val SnaSdlcMib = "SNA-SDLC-MIB"
  val SnmpCommunityMib = "SNMP-COMMUNITY-MIB"
  val SnmpFrameworkMib = "SNMP-FRAMEWORK-MIB"
  val SnmpMpdMib = "SNMP-MPD-MIB"
  val SnmpNotificationMib = "SNMP-NOTIFICATION-MIB"
  val SnmpProxyMib = "SNMP-PROXY-MIB"
  val SnmpRepeaterMib = "SNMP-REPEATER-MIB"
  val SnmpTargetMib = "SNMP-TARGET-MIB"
  val SnmpUserBasedSmMib = "SNMP-USER-BASED-SM-MIB"
  val SnmpUsmAesMib = "SNMP-USM-AES-MIB"
  val SnmpUsmDhObjectsMib = "SNMP-USM-DH-OBJECTS-MIB"
  val Snmpv2Conf = "SNMPv2-CONF"
  val Snmpv2Mib = "SNMPv2-MIB"
  val Snmpv2Pdu = "SNMPv2-PDU"
  val Snmpv2Smi = "SNMPv2-SMI"
  val Snmpv2Tc = "SNMPv2-TC"
  val Snmpv2Tm = "SNMPv2-TM"
  val Snmpv2UsecMib = "SNMPv2-USEC-MIB"
  val SnmpViewBasedAcmMib = "SNMP-VIEW-BASED-ACM-MIB"
  val SonetMib = "SONET-MIB"
  val SourceRoutingMib = "SOURCE-ROUTING-MIB"
  val SspmMib = "SSPM-MIB"
  val SysapplMib = "SYSAPPL-MIB"
  val T11FcFabricAddrMgrMib = "T11-FC-FABRIC-ADDR-MGR-MIB"
  val T11FcFabricConfigServerMib = "T11-FC-FABRIC-CONFIG-SERVER-MIB"
  val T11FcFabricLockMib = "T11-FC-FABRIC-LOCK-MIB"
  val T11FcFspfMib = "T11-FC-FSPF-MIB"
  val T11FcNameServerMib = "T11-FC-NAME-SERVER-MIB"
  val T11FcRouteMib = "T11-FC-ROUTE-MIB"
  val T11FcRscnMib = "T11-FC-RSCN-MIB"
  val T11FcVirtualFabricMib = "T11-FC-VIRTUAL-FABRIC-MIB"
  val T11FcZoneServerMib = "T11-FC-ZONE-SERVER-MIB"
  val T11TcMib = "T11-TC-MIB"
  val TcpEstatsMib = "TCP-ESTATS-MIB"
  val TcpipxMib = "TCPIPX-MIB"
  val TcpMib = "TCP-MIB"
  val TeLinkStdMib = "TE-LINK-STD-MIB"
  val TeMib = "TE-MIB"
  val TimeAggregateMib = "TIME-AGGREGATE-MIB"
  val Tn3270eMib = "TN3270E-MIB"
  val Tn3270eRtMib = "TN3270E-RT-MIB"
  val TokenringMib = "TOKENRING-MIB"
  val TokenRingRmonMib = "TOKEN-RING-RMON-MIB"
  val TokenringStationSrMib = "TOKENRING-STATION-SR-MIB"
  val TransportAddressMib = "TRANSPORT-ADDRESS-MIB"
  val TripMib = "TRIP-MIB"
  val TripTcMib = "TRIP-TC-MIB"
  val TunnelMib = "TUNNEL-MIB"
  val UdpliteMib = "UDPLITE-MIB"
  val UdpMib = "UDP-MIB"
  val UpsMib = "UPS-MIB"
  val UriTcMib = "URI-TC-MIB"
  val VdslLineExtMcmMib = "VDSL-LINE-EXT-MCM-MIB"
  val VdslLineExtScmMib = "VDSL-LINE-EXT-SCM-MIB"
  val VdslLineMib = "VDSL-LINE-MIB"
  val VpnTcStdMib = "VPN-TC-STD-MIB"
  val VrrpMib = "VRRP-MIB"
  val WwwMib = "WWW-MIB"

}
