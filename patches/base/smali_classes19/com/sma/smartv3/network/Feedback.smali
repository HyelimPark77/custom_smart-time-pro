.class public final Lcom/sma/smartv3/network/Feedback;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final CONTACT_WAY:Ljava/lang/String; = "contactWay"
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final CONTENT:Ljava/lang/String; = "content"
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final EXTRA_INFO:Ljava/lang/String; = "extraInfo"
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final INSTANCE:Lcom/sma/smartv3/network/Feedback;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final PROJECT_ID:Ljava/lang/String; = "projectId"
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final URL:Ljava/lang/String; = "/feedback/add"
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/sma/smartv3/network/Feedback;

    invoke-direct {v0}, Lcom/sma/smartv3/network/Feedback;-><init>()V

    sput-object v0, Lcom/sma/smartv3/network/Feedback;->INSTANCE:Lcom/sma/smartv3/network/Feedback;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
