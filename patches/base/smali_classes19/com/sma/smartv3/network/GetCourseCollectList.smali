.class public final Lcom/sma/smartv3/network/GetCourseCollectList;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final INSTANCE:Lcom/sma/smartv3/network/GetCourseCollectList;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final URL:Ljava/lang/String; = "/course/appCollectSearch"
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

    new-instance v0, Lcom/sma/smartv3/network/GetCourseCollectList;

    invoke-direct {v0}, Lcom/sma/smartv3/network/GetCourseCollectList;-><init>()V

    sput-object v0, Lcom/sma/smartv3/network/GetCourseCollectList;->INSTANCE:Lcom/sma/smartv3/network/GetCourseCollectList;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
