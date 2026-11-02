.class public final Lcom/sma/smartv3/network/GetOnLinWatchFaceListV2;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final BLE_NAME:Ljava/lang/String; = "bleName"
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final DIAL_TYPE:Ljava/lang/String; = "dialType"
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final FLAG:Ljava/lang/String; = "flag"
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final IDENTITY:Ljava/lang/String; = "identity"
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final INSTANCE:Lcom/sma/smartv3/network/GetOnLinWatchFaceListV2;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final PAGE_NUM:Ljava/lang/String; = "pageNum"
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final PAGE_SIZE:Ljava/lang/String; = "pageSize"
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final TYP_GROUP_FLAG:Ljava/lang/String; = "typeGroupFlag"
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final URL:Ljava/lang/String; = "/watchFace/v2/appSearch"
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/sma/smartv3/network/GetOnLinWatchFaceListV2;

    invoke-direct {v0}, Lcom/sma/smartv3/network/GetOnLinWatchFaceListV2;-><init>()V

    sput-object v0, Lcom/sma/smartv3/network/GetOnLinWatchFaceListV2;->INSTANCE:Lcom/sma/smartv3/network/GetOnLinWatchFaceListV2;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
