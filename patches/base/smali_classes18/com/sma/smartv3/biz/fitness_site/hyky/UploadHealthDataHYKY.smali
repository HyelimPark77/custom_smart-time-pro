.class public final Lcom/sma/smartv3/biz/fitness_site/hyky/UploadHealthDataHYKY;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/sma/smartv3/biz/fitness_site/hyky/UploadHealthDataHYKY$BloodOxygen;,
        Lcom/sma/smartv3/biz/fitness_site/hyky/UploadHealthDataHYKY$BloodPressure;,
        Lcom/sma/smartv3/biz/fitness_site/hyky/UploadHealthDataHYKY$BodyData;,
        Lcom/sma/smartv3/biz/fitness_site/hyky/UploadHealthDataHYKY$HealthBase;,
        Lcom/sma/smartv3/biz/fitness_site/hyky/UploadHealthDataHYKY$HealthIndex;,
        Lcom/sma/smartv3/biz/fitness_site/hyky/UploadHealthDataHYKY$HeartRate;,
        Lcom/sma/smartv3/biz/fitness_site/hyky/UploadHealthDataHYKY$Location;,
        Lcom/sma/smartv3/biz/fitness_site/hyky/UploadHealthDataHYKY$StepCount;,
        Lcom/sma/smartv3/biz/fitness_site/hyky/UploadHealthDataHYKY$Temperature;,
        Lcom/sma/smartv3/biz/fitness_site/hyky/UploadHealthDataHYKY$Weight;
    }
.end annotation


# static fields
.field public static final INSTANCE:Lcom/sma/smartv3/biz/fitness_site/hyky/UploadHealthDataHYKY;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final URL:Ljava/lang/String; = "/ac-health-data/thirdPlatform/userDevice/general/dataReport/healthData"
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadHealthDataHYKY;

    invoke-direct {v0}, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadHealthDataHYKY;-><init>()V

    sput-object v0, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadHealthDataHYKY;->INSTANCE:Lcom/sma/smartv3/biz/fitness_site/hyky/UploadHealthDataHYKY;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
