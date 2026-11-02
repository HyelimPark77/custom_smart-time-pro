.class public final Lcom/sma/smartv3/network/GetGooglePayCheckOrder;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final APPLICATION_NAME:Ljava/lang/String; = "applicationName"
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final INSTANCE:Lcom/sma/smartv3/network/GetGooglePayCheckOrder;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final ORDER_NUM:Ljava/lang/String; = "orderNum"
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final PACKAGE_NAME:Ljava/lang/String; = "packageName"
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final PRODUCT_IT:Ljava/lang/String; = "productId"
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final PURCHASE_TOKEN:Ljava/lang/String; = "purchaseToken"
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final URL:Ljava/lang/String; = "/aliPay/google/checkOrder"
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/sma/smartv3/network/GetGooglePayCheckOrder;

    invoke-direct {v0}, Lcom/sma/smartv3/network/GetGooglePayCheckOrder;-><init>()V

    sput-object v0, Lcom/sma/smartv3/network/GetGooglePayCheckOrder;->INSTANCE:Lcom/sma/smartv3/network/GetGooglePayCheckOrder;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
