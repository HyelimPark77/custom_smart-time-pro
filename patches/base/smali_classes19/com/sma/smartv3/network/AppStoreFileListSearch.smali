.class public final Lcom/sma/smartv3/network/AppStoreFileListSearch;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final APP_MODULE_ID:Ljava/lang/String; = "appModuleId"
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final BLE_NAME:Ljava/lang/String; = "bleName"
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final FLAG:Ljava/lang/String; = "flag"
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final INSTANCE:Lcom/sma/smartv3/network/AppStoreFileListSearch;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final URL:Ljava/lang/String; = "/appx/appSearch"
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/sma/smartv3/network/AppStoreFileListSearch;

    invoke-direct {v0}, Lcom/sma/smartv3/network/AppStoreFileListSearch;-><init>()V

    sput-object v0, Lcom/sma/smartv3/network/AppStoreFileListSearch;->INSTANCE:Lcom/sma/smartv3/network/AppStoreFileListSearch;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
