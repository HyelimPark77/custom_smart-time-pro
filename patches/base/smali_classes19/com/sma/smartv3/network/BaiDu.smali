.class public final Lcom/sma/smartv3/network/BaiDu;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final AK_SERVICE_KEY:Ljava/lang/String; = "ak"
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final AK_SERVICE_VALUE:Ljava/lang/String; = "qcXtk4qlqB31PI8KK74Sw8k6jQhBlBqH"
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final DOWNLOAD_POINT:Ljava/lang/String; = "DownloadPoint"
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final DOWNLOAD_POINT_URL:Ljava/lang/String; = "https://yingyan.baidu.com/api/v3/track/gettrack"
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final END_TIME:Ljava/lang/String; = "end_time"
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final ENTITY_NAME:Ljava/lang/String; = "entity_name"
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final INSTANCE:Lcom/sma/smartv3/network/BaiDu;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final IS_PROCESSED:Ljava/lang/String; = "is_processed"
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final MCODE_KEY:Ljava/lang/String; = "mcode"
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final MCODE_VALUE:Ljava/lang/String; = "DA:1C:3F:7D:5D:F1:26:11:78:8C:94:72:52:E4:32:03:46:43:89:70;com.sma.smartv3"
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final PAGE_SIZE_KEY:Ljava/lang/String; = "page_size"
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final PAGE_SIZE_VALUE:Ljava/lang/String; = "4000"
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final POINT_LIST_KEY:Ljava/lang/String; = "point_list"
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final SERVICE_ID_KEY:Ljava/lang/String; = "service_id"
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final SERVICE_ID_VALUE:Ljava/lang/String; = "219280"
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final START_TIME:Ljava/lang/String; = "start_time"
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final SUPPLEMENT_CONTENT_KEY:Ljava/lang/String; = "supplement_content"
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final SUPPLEMENT_CONTENT_VALUE:Ljava/lang/String; = "distance_and_points"
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final SUPPLEMENT_MODE_KEY:Ljava/lang/String; = "supplement_mode"
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final SUPPLEMENT_MODE_VALUE:Ljava/lang/String; = "walking"
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final UPLOAD_POINT:Ljava/lang/String; = "UploadPoint"
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final UPLOAD_POINT_URL:Ljava/lang/String; = "https://yingyan.baidu.com/api/v3/track/addpoints"
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/sma/smartv3/network/BaiDu;

    invoke-direct {v0}, Lcom/sma/smartv3/network/BaiDu;-><init>()V

    sput-object v0, Lcom/sma/smartv3/network/BaiDu;->INSTANCE:Lcom/sma/smartv3/network/BaiDu;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
