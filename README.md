# cassandraDemo

# orderheader schema

CREATE TABLE [dbo].[OrderHeader](
	[OrderHeaderID] [bigint] IDENTITY(1,1) NOT FOR REPLICATION NOT NULL,
	[CustomerProfileID] [bigint] NULL,
	[StoreOrderID] [char](8) NOT NULL,
	[ProcStoreID] [int] NOT NULL,
	[ShipStoreID] [int] NOT NULL,
	[OrderStatusID] [char](2) NOT NULL,
	[SalesChannelID] [char](2) NULL,
	[OrderMonth] [char](6) NOT NULL,
	[TotalAmount] [money] NULL,
	[TotalVolumePoint] [money] NULL,
	[TotalDiscount] [money] NULL,
	[BeforeDiscTaxAmount] [money] NULL,
	[AfterDiscTaxAmount] [money] NULL,
	[RoundingAdjust] [numeric](3, 2) NULL,
	[PromotionAmount] [money] NULL,
	[TotalDue] [money] NULL,
	[FullProdRetail] [money] NULL,
	[DiscProdRetail] [money] NULL,
	[LiteratureAmt] [money] NULL,
	[AOPAmount] [money] NULL,
	[TotalPayment] [money] NULL,
	[DiscountPct] [numeric](5, 2) NULL,
	[OrderDate] [datetime] NOT NULL,
	[NTSDate] [datetime] NULL,
	[PaidDate] [datetime] NULL,
	[ShipDate] [datetime] NULL,
	[ShippingInstruction] [nvarchar](200) NULL,
	[RoyalProcessedInd] [bit] NOT NULL,
	[Comment] [nvarchar](250) NULL,
	[UpdateCount] [int] NULL,
	[CreatedOn] [datetime] NOT NULL,
	[CreatedBy] [varchar](50) NOT NULL,
	[UpdatedOn] [datetime] NULL,
	[UpdatedBy] [varchar](50) NULL,
	[IsDeleted] [bit] NOT NULL,
	[IsPosOrder] [int] NULL,
	[DonationAmount] [decimal](15, 2) NULL,
	[DonationAmount2] [decimal](15, 2) NULL,
	[PCOrderFlag] [int] NOT NULL,
	[ReferralID] [bigint] NULL,
	[RCOrderFlag] [int] NOT NULL
) ON [PRIMARY]
GO

# orderDetail schema
CREATE TABLE [dbo].[OrderDetail](
	[OrderHeaderID] [bigint] NOT NULL,
	[ProductID] [int] NOT NULL,
	[Quantity] [int] NOT NULL,
	[UnitPrice] [money] NOT NULL,
	[VolumePoint] [money] NULL,
	[BeforeDiscTaxAmount] [money] NULL,
	[AfterDiscTaxAmount] [money] NULL,
	[Discount] [money] NULL,
	[CreatedOn] [datetime] NOT NULL,
	[CreatedBy] [varchar](50) NOT NULL,
	[UpdatedOn] [datetime] NULL,
	[UpdatedBy] [varchar](50) NULL,
	[IsDeleted] [bit] NOT NULL,
	[OrderDetailID] [bigint] IDENTITY(1,1) NOT FOR REPLICATION NOT NULL,
	[RetailEarnbase] [money] NOT NULL,
	[DiscEarnbase] [money] NOT NULL,
	[DiscVolumePoint] [money] NOT NULL
) ON [PRIMARY]
GO

# order Extention schema

CREATE TABLE [dbo].[OrderExtention](
	[Id] [bigint] IDENTITY(1,1) NOT FOR REPLICATION NOT NULL,
	[OrderHeaderId] [bigint] NOT NULL,
	[Channel] [varchar](40) NOT NULL,
	[TotalFreight] [decimal](18, 2) NOT NULL,
	[PayFreight] [decimal](18, 2) NOT NULL,
	[ExchangedFreight] [decimal](18, 2) NOT NULL,
	[ExchangedPoints] [int] NULL,
	[CreateTime] [datetime] NOT NULL,
	[CreatedBy] [varchar](40) NOT NULL,
	[LastUpdateTime] [datetime] NULL,
	[LastUpdatedBy] [varchar](40) NULL,
	[Remark] [nvarchar](600) NULL,
	[IsDeleted] [bit] NOT NULL,
	[CanDeleted] [bit] NOT NULL,
	[Status] [int] NOT NULL,
	[Version] [bigint] NOT NULL,
	[Sort] [bigint] NOT NULL,
	[JoinExchangePoint] [int] NULL,
	[JoinExchangeAmount] [decimal](18, 2) NULL,
	[OrderMsg] [nvarchar](100) NULL,
	[TicketExchangePoint] [int] NULL,
	[TicketExchangeAmount] [decimal](18, 4) NULL,
	[FeeCustomerId] [int] NULL,
	[FeeCarrierId] [int] NULL,
	[TariffAmount] [decimal](18, 2) NULL,
	[InvoiceCharge] [decimal](18, 4) NOT NULL,
	[UnionID] [varchar](200) NOT NULL,
	[OpenID] [varchar](200) NOT NULL,
	[TrackerCode] [varchar](100) NOT NULL,
	[UserReceiveDate] [datetime] NULL,
	[ReturnEffectiveDate] [datetime] NULL,
	[ReturnExpiryDate] [datetime] NULL,
	[ReturnDateType] [int] NOT NULL,
	[GrfStatusID] [nvarchar](20) NOT NULL,
	[ParentOrderId] [varchar](16) NULL,
	[TariffRate] [numeric](20, 18) NULL
) ON [PRIMARY]
GO

# orderDelivery schema

CREATE TABLE [dbo].[OrderDelivery](
	[OrderDeliveryID] [bigint] IDENTITY(1,1) NOT FOR REPLICATION NOT NULL,
	[OrderHeaderID] [bigint] NOT NULL,
	[OrderDeliveryType] [varchar](50) NULL,
	[ExpressCompanyId] [int] NULL,
	[SenderName] [nvarchar](200) NULL,
	[SenderProvince] [nvarchar](50) NULL,
	[SenderCity] [nvarchar](50) NULL,
	[SenderDistrict] [nvarchar](50) NULL,
	[SenderAddress] [nvarchar](255) NULL,
	[SenderCompany] [nvarchar](255) NULL,
	[SenderPhone] [char](20) NULL,
	[SenderMobile] [char](20) NULL,
	[ReceivingName] [nvarchar](200) NULL,
	[ReceivingProvince] [nvarchar](50) NULL,
	[ReceivingCity] [nvarchar](50) NULL,
	[ReceivingDistrict] [nvarchar](50) NULL,
	[ReceivingAddress] [nvarchar](255) NULL,
	[ReceivingCompany] [nvarchar](255) NULL,
	[ReceivingPhone] [char](20) NULL,
	[ReceivingMobile] [char](20) NULL,
	[CommodityAmount] [varchar](10) NULL,
	[CommodityWeight] [varchar](10) NULL,
	[CommodityDIMWeight] [varchar](10) NULL,
	[CommodityName] [nvarchar](255) NULL,
	[CommodityDimension] [varchar](10) NULL,
	[Package] [nvarchar](50) NULL,
	[PackageAmount] [varchar](10) NULL,
	[ChargeableWeight] [decimal](15, 5) NULL,
	[Payment] [nvarchar](50) NULL,
	[Remark] [nvarchar](50) NULL,
	[PackageCharges] [money] NULL,
	[FreightCharges] [money] NULL,
	[TotalCharges] [money] NULL,
	[ExpressNum] [varchar](50) NULL,
	[CreatedBy] [varchar](50) NULL,
	[CreatedON] [datetime] NOT NULL,
	[UpdatedBy] [varchar](50) NULL,
	[UpdatedON] [datetime] NULL,
	[IsDeleted] [bit] NOT NULL,
	[Insurance] [decimal](15, 2) NULL,
	[StoreID] [int] NULL,
	[DC] [nvarchar](10) NULL,
	[PostalCode] [varchar](50) NULL,
	[RecieveDate] [datetime] NULL,
	[ConfirmedEmail] [nvarchar](50) NULL,
	[ConfirmedMP] [nvarchar](20) NULL,
	[NeedInvoice] [int] NULL,
	[TotalVolume] [decimal](15, 5) NULL,
	[ProductWeight] [decimal](15, 5) NULL,
	[PackageWeight] [decimal](15, 5) NULL,
	[ActualWeight] [decimal](15, 5) NULL,
	[InvoiceType] [nvarchar](1000) NULL,
	[InvoiceTitle] [nvarchar](1000) NULL,
	[InvoiceContent] [nvarchar](1000) NULL,
	[VolumeWeight] [decimal](15, 5) NULL,
	[InvoiceReceivingAddress] [nvarchar](255) NULL,
	[PickUpDate] [datetime] NULL,
	[CertificateType] [varchar](20) NULL,
	[CertificateCode] [varchar](50) NULL,
	[ApplyInvoiceDate] [datetime] NULL,
	[InvoiceNumber] [nvarchar](100) NULL,
	[isEDI] [int] NULL,
	[GroupValue] [varchar](50) NULL,
	[OtherAdjust] [decimal](15, 2) NULL
) ON [PRIMARY]
GO

# 
For data model like:

create type city (
   name text,
   code int
);

create table user (
    id uuid,
    name text,
    cities list<FROZEN<city>>,
    primary key ( id )
);