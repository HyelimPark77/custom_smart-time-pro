.class public final Lcom/sma/smartv3/network/GetWatchFaceDetail;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final ID:Ljava/lang/String; = "id"
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final IDENTITY:Ljava/lang/String; = "identity"
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final INSTANCE:Lcom/sma/smartv3/network/GetWatchFaceDetail;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final URL:Ljava/lang/String; = "/watchFace/appFindById"
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/sma/smartv3/network/GetWatchFaceDetail;

    invoke-direct {v0}, Lcom/sma/smartv3/network/GetWatchFaceDetail;-><init>()V

    sput-object v0, Lcom/sma/smartv3/network/GetWatchFaceDetail;->INSTANCE:Lcom/sma/smartv3/network/GetWatchFaceDetail;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
