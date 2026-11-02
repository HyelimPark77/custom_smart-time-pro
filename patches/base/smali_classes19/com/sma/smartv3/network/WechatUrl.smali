.class public final Lcom/sma/smartv3/network/WechatUrl;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final CHANGE_DEVICE_STATE:Ljava/lang/String; = "/wechat/pay/changeDeviceState"
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final GET_DEVICE_STATE:Ljava/lang/String; = "/wechat/pay/getDeviceState"
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final GET_PAY_MAC_ADDRESS:Ljava/lang/String; = "/wechat/pay/getPayMacAddress"
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final INSTANCE:Lcom/sma/smartv3/network/WechatUrl;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/sma/smartv3/network/WechatUrl;

    invoke-direct {v0}, Lcom/sma/smartv3/network/WechatUrl;-><init>()V

    sput-object v0, Lcom/sma/smartv3/network/WechatUrl;->INSTANCE:Lcom/sma/smartv3/network/WechatUrl;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
