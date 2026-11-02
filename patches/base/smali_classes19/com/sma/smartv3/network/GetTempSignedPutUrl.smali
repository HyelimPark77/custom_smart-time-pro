.class public final Lcom/sma/smartv3/network/GetTempSignedPutUrl;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final IDENTITY:Ljava/lang/String; = "identity"
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final INSTANCE:Lcom/sma/smartv3/network/GetTempSignedPutUrl;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final UPLOAD_OSSFILEPATH:Ljava/lang/String; = "uploadOSSFilePath"
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final URL:Ljava/lang/String; = "/ali/getTempSignedPutUrl"
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/sma/smartv3/network/GetTempSignedPutUrl;

    invoke-direct {v0}, Lcom/sma/smartv3/network/GetTempSignedPutUrl;-><init>()V

    sput-object v0, Lcom/sma/smartv3/network/GetTempSignedPutUrl;->INSTANCE:Lcom/sma/smartv3/network/GetTempSignedPutUrl;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
