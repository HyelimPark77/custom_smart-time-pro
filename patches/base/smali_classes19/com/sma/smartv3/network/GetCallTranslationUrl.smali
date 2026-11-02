.class public final Lcom/sma/smartv3/network/GetCallTranslationUrl;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final BLEINFO:Ljava/lang/String; = "BleInfo"
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final INSTANCE:Lcom/sma/smartv3/network/GetCallTranslationUrl;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final LANGUAGE:Ljava/lang/String; = "language"
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final TARGET_LANGUAGE:Ljava/lang/String; = "targetLanguage"
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final TYPE:Ljava/lang/String; = "type"
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final URL:Ljava/lang/String; = "/sw/creteurl"
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final USER_ID:Ljava/lang/String; = "uid"
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/sma/smartv3/network/GetCallTranslationUrl;

    invoke-direct {v0}, Lcom/sma/smartv3/network/GetCallTranslationUrl;-><init>()V

    sput-object v0, Lcom/sma/smartv3/network/GetCallTranslationUrl;->INSTANCE:Lcom/sma/smartv3/network/GetCallTranslationUrl;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
