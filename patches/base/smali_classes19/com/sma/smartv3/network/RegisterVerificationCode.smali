.class public final Lcom/sma/smartv3/network/RegisterVerificationCode;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final INSTANCE:Lcom/sma/smartv3/network/RegisterVerificationCode;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final NICK_NAME:Ljava/lang/String; = "nickName"
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final PASSWORD:Ljava/lang/String; = "password"
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final PROJECT_ID:Ljava/lang/String; = "projectId"
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final URL:Ljava/lang/String; = "/appuser/register_verification_code"
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final USER_NAME:Ljava/lang/String; = "userName"
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final VERIFICATION_CODE:Ljava/lang/String; = "verificationCode"
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final VERIFY_PASSWORD:Ljava/lang/String; = "verifyPassword"
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/sma/smartv3/network/RegisterVerificationCode;

    invoke-direct {v0}, Lcom/sma/smartv3/network/RegisterVerificationCode;-><init>()V

    sput-object v0, Lcom/sma/smartv3/network/RegisterVerificationCode;->INSTANCE:Lcom/sma/smartv3/network/RegisterVerificationCode;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
