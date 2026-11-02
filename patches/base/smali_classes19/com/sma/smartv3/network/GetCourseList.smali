.class public final Lcom/sma/smartv3/network/GetCourseList;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final COURSE_DIFF:Ljava/lang/String; = "courseDiff"
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final COURSE_PART:Ljava/lang/String; = "coursePart"
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final COURSE_TYPE:Ljava/lang/String; = "courseType"
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final INSTANCE:Lcom/sma/smartv3/network/GetCourseList;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final URL:Ljava/lang/String; = "/course/appSearch"
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/sma/smartv3/network/GetCourseList;

    invoke-direct {v0}, Lcom/sma/smartv3/network/GetCourseList;-><init>()V

    sput-object v0, Lcom/sma/smartv3/network/GetCourseList;->INSTANCE:Lcom/sma/smartv3/network/GetCourseList;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
