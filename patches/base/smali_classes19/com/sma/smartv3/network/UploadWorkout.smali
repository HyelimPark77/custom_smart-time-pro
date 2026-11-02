.class public final Lcom/sma/smartv3/network/UploadWorkout;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final INSTANCE:Lcom/sma/smartv3/network/UploadWorkout;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final URL:Ljava/lang/String; = "/ble_workout/upload"
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/sma/smartv3/network/UploadWorkout;

    invoke-direct {v0}, Lcom/sma/smartv3/network/UploadWorkout;-><init>()V

    sput-object v0, Lcom/sma/smartv3/network/UploadWorkout;->INSTANCE:Lcom/sma/smartv3/network/UploadWorkout;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
