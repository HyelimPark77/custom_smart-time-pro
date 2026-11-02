.class public final Lcom/sma/smartv3/network/AccountIntegralDetails;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final IDENTITY:Ljava/lang/String; = "identity"
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final INSTANCE:Lcom/sma/smartv3/network/AccountIntegralDetails;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final ORDER_PAGE_NUM:Ljava/lang/String; = "pageNum"
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final URL:Ljava/lang/String; = "/accountDetails"
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/sma/smartv3/network/AccountIntegralDetails;

    invoke-direct {v0}, Lcom/sma/smartv3/network/AccountIntegralDetails;-><init>()V

    sput-object v0, Lcom/sma/smartv3/network/AccountIntegralDetails;->INSTANCE:Lcom/sma/smartv3/network/AccountIntegralDetails;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
