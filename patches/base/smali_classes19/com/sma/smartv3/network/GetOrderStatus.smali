.class public final Lcom/sma/smartv3/network/GetOrderStatus;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final IDENTITY:Ljava/lang/String; = "identity"
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final INSTANCE:Lcom/sma/smartv3/network/GetOrderStatus;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final ORDER_NUM:Ljava/lang/String; = "orderNum"
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final ORDER_TYPE:Ljava/lang/String; = "orderType"
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final URL:Ljava/lang/String; = "/order/selectByOrderNum"
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/sma/smartv3/network/GetOrderStatus;

    invoke-direct {v0}, Lcom/sma/smartv3/network/GetOrderStatus;-><init>()V

    sput-object v0, Lcom/sma/smartv3/network/GetOrderStatus;->INSTANCE:Lcom/sma/smartv3/network/GetOrderStatus;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
