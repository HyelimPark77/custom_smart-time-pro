.class public final Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$BodyData;,
        Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$Hr;,
        Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$Pace;,
        Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$Pos;,
        Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportData;,
        Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportOverView;,
        Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportType;,
        Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$StepFreq;
    }
.end annotation


# static fields
.field public static final INSTANCE:Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final URL:Ljava/lang/String; = "/ac-health-data/thirdPlatform/userDevice/general/dataReport/sportData"
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY;

    invoke-direct {v0}, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY;-><init>()V

    sput-object v0, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY;->INSTANCE:Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
