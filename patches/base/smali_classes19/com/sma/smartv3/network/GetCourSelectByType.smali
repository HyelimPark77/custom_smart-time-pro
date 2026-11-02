.class public final Lcom/sma/smartv3/network/GetCourSelectByType;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final COURSE_DIFF:Ljava/lang/String; = "course_diff"
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final COURSE_PART:Ljava/lang/String; = "course_part"
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final COURSE_SORT_TYPE:Ljava/lang/String; = "course_sortType"
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final INSTANCE:Lcom/sma/smartv3/network/GetCourSelectByType;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final LANGUAGE:Ljava/lang/String; = "language"
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final URL:Ljava/lang/String; = "/dict-data/selectByType"
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/sma/smartv3/network/GetCourSelectByType;

    invoke-direct {v0}, Lcom/sma/smartv3/network/GetCourSelectByType;-><init>()V

    sput-object v0, Lcom/sma/smartv3/network/GetCourSelectByType;->INSTANCE:Lcom/sma/smartv3/network/GetCourSelectByType;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
