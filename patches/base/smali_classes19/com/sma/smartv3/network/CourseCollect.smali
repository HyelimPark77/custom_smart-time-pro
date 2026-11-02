.class public final Lcom/sma/smartv3/network/CourseCollect;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final COLLECT_FLAG:Ljava/lang/String; = "collectFlag"
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final COURSE_ID:Ljava/lang/String; = "cid"
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final INSTANCE:Lcom/sma/smartv3/network/CourseCollect;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final URL:Ljava/lang/String; = "/course/appCollect"
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

    new-instance v0, Lcom/sma/smartv3/network/CourseCollect;

    invoke-direct {v0}, Lcom/sma/smartv3/network/CourseCollect;-><init>()V

    sput-object v0, Lcom/sma/smartv3/network/CourseCollect;->INSTANCE:Lcom/sma/smartv3/network/CourseCollect;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
