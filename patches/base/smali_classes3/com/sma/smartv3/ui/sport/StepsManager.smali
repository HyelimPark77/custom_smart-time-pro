.class public final Lcom/sma/smartv3/ui/sport/StepsManager;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/sma/smartv3/ui/sport/StepsManager$DetectStatus;,
        Lcom/sma/smartv3/ui/sport/StepsManager$OXO1;
    }
.end annotation


# instance fields
.field public I0IIOi:I

.field public I0iXXO:Lcom/sma/smartv3/ui/sport/StepsManager$XIi00iiXO;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public IO:I

.field public IiI10X:Lcom/sma/smartv3/ui/sport/StepsManager$DetectStatus;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public O00:I

.field public OIX0iXi:Lcom/sma/smartv3/ui/sport/StepsManager$OXO1;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field public OIi0:I

.field public final OXO1:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public XIi00iiXO:Landroid/hardware/SensorManager;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field public XO0O10:Landroid/hardware/Sensor;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field public XOO0ii0:I

.field public iO:Landroid/hardware/Sensor;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/sma/smartv3/ui/sport/StepsManager$OXO1;)V
    .locals 4
    .param p1    # Landroid/content/Context;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p2    # Lcom/sma/smartv3/ui/sport/StepsManager$OXO1;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onStepListener"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "StepsManager"

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/StepsManager;->OXO1:Ljava/lang/String;

    sget-object v1, Lcom/sma/smartv3/ui/sport/StepsManager$DetectStatus;->END:Lcom/sma/smartv3/ui/sport/StepsManager$DetectStatus;

    iput-object v1, p0, Lcom/sma/smartv3/ui/sport/StepsManager;->IiI10X:Lcom/sma/smartv3/ui/sport/StepsManager$DetectStatus;

    new-instance v1, Lcom/sma/smartv3/ui/sport/StepsManager$XIi00iiXO;

    invoke-direct {v1, p0}, Lcom/sma/smartv3/ui/sport/StepsManager$XIi00iiXO;-><init>(Lcom/sma/smartv3/ui/sport/StepsManager;)V

    iput-object v1, p0, Lcom/sma/smartv3/ui/sport/StepsManager;->I0iXXO:Lcom/sma/smartv3/ui/sport/StepsManager$XIi00iiXO;

    const-string v1, "sensor"

    invoke-virtual {p1, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    const-string v1, "null cannot be cast to non-null type android.hardware.SensorManager"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->X1ii(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Landroid/hardware/SensorManager;

    iput-object p1, p0, Lcom/sma/smartv3/ui/sport/StepsManager;->XIi00iiXO:Landroid/hardware/SensorManager;

    const/4 v1, 0x0

    const/16 v2, 0x12

    if-eqz p1, :cond_0

    invoke-virtual {p1, v2}, Landroid/hardware/SensorManager;->getDefaultSensor(I)Landroid/hardware/Sensor;

    move-result-object p1

    goto :goto_0

    :cond_0
    move-object p1, v1

    :goto_0
    iput-object p1, p0, Lcom/sma/smartv3/ui/sport/StepsManager;->iO:Landroid/hardware/Sensor;

    iget-object p1, p0, Lcom/sma/smartv3/ui/sport/StepsManager;->XIi00iiXO:Landroid/hardware/SensorManager;

    const/16 v3, 0x13

    if-eqz p1, :cond_1

    invoke-virtual {p1, v3}, Landroid/hardware/SensorManager;->getDefaultSensor(I)Landroid/hardware/Sensor;

    move-result-object v1

    :cond_1
    iput-object v1, p0, Lcom/sma/smartv3/ui/sport/StepsManager;->XO0O10:Landroid/hardware/Sensor;

    iput-object p2, p0, Lcom/sma/smartv3/ui/sport/StepsManager;->OIX0iXi:Lcom/sma/smartv3/ui/sport/StepsManager$OXO1;

    const/4 p1, 0x0

    if-eqz v1, :cond_2

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " Current sensor StepCountSensor "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    filled-new-array {p2}, [Ljava/lang/Object;

    move-result-object p2

    invoke-static {p2}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    iput v3, p0, Lcom/sma/smartv3/ui/sport/StepsManager;->O00:I

    iget-object p2, p0, Lcom/sma/smartv3/ui/sport/StepsManager;->XIi00iiXO:Landroid/hardware/SensorManager;

    if-eqz p2, :cond_3

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/StepsManager;->I0iXXO:Lcom/sma/smartv3/ui/sport/StepsManager$XIi00iiXO;

    iget-object v1, p0, Lcom/sma/smartv3/ui/sport/StepsManager;->XO0O10:Landroid/hardware/Sensor;

    invoke-virtual {p2, v0, v1, p1}, Landroid/hardware/SensorManager;->registerListener(Landroid/hardware/SensorEventListener;Landroid/hardware/Sensor;I)Z

    return-void

    :cond_2
    iget-object p2, p0, Lcom/sma/smartv3/ui/sport/StepsManager;->iO:Landroid/hardware/Sensor;

    if-eqz p2, :cond_4

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " Current sensor StepDetectorSensor "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    filled-new-array {p2}, [Ljava/lang/Object;

    move-result-object p2

    invoke-static {p2}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    iput v2, p0, Lcom/sma/smartv3/ui/sport/StepsManager;->O00:I

    iget-object p2, p0, Lcom/sma/smartv3/ui/sport/StepsManager;->XIi00iiXO:Landroid/hardware/SensorManager;

    if-eqz p2, :cond_3

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/StepsManager;->I0iXXO:Lcom/sma/smartv3/ui/sport/StepsManager$XIi00iiXO;

    iget-object v1, p0, Lcom/sma/smartv3/ui/sport/StepsManager;->iO:Landroid/hardware/Sensor;

    invoke-virtual {p2, v0, v1, p1}, Landroid/hardware/SensorManager;->registerListener(Landroid/hardware/SensorEventListener;Landroid/hardware/Sensor;I)Z

    :cond_3
    return-void

    :cond_4
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " Count sensor not available!"

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    filled-new-array {p2}, [Ljava/lang/Object;

    move-result-object p2

    invoke-static {p2}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    iput p1, p0, Lcom/sma/smartv3/ui/sport/StepsManager;->O00:I

    return-void
.end method

.method public static final synthetic I0IIOi(Lcom/sma/smartv3/ui/sport/StepsManager;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/sport/StepsManager;->OXO1:Ljava/lang/String;

    return-object p0
.end method

.method public static final synthetic I0iXXO(Lcom/sma/smartv3/ui/sport/StepsManager;I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/ui/sport/StepsManager;->IO:I

    return-void
.end method

.method public static final synthetic IO(Lcom/sma/smartv3/ui/sport/StepsManager;I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/ui/sport/StepsManager;->OIi0:I

    return-void
.end method

.method public static final synthetic IiI10X(Lcom/sma/smartv3/ui/sport/StepsManager;)Lcom/sma/smartv3/ui/sport/StepsManager$OXO1;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/sport/StepsManager;->OIX0iXi:Lcom/sma/smartv3/ui/sport/StepsManager$OXO1;

    return-object p0
.end method

.method public static final synthetic O00(Lcom/sma/smartv3/ui/sport/StepsManager;)I
    .locals 0

    iget p0, p0, Lcom/sma/smartv3/ui/sport/StepsManager;->I0IIOi:I

    return p0
.end method

.method public static final synthetic OIX0iXi(Lcom/sma/smartv3/ui/sport/StepsManager;I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/ui/sport/StepsManager;->I0IIOi:I

    return-void
.end method

.method public static final synthetic OIi0(Lcom/sma/smartv3/ui/sport/StepsManager;I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/ui/sport/StepsManager;->XOO0ii0:I

    return-void
.end method

.method public static final synthetic OXO1(Lcom/sma/smartv3/ui/sport/StepsManager;)I
    .locals 0

    iget p0, p0, Lcom/sma/smartv3/ui/sport/StepsManager;->O00:I

    return p0
.end method

.method public static final synthetic XIi00iiXO(Lcom/sma/smartv3/ui/sport/StepsManager;)I
    .locals 0

    iget p0, p0, Lcom/sma/smartv3/ui/sport/StepsManager;->XOO0ii0:I

    return p0
.end method

.method public static final synthetic XO0O10(Lcom/sma/smartv3/ui/sport/StepsManager;)I
    .locals 0

    iget p0, p0, Lcom/sma/smartv3/ui/sport/StepsManager;->OIi0:I

    return p0
.end method

.method public static final synthetic XOO0ii0(Lcom/sma/smartv3/ui/sport/StepsManager;)I
    .locals 0

    iget p0, p0, Lcom/sma/smartv3/ui/sport/StepsManager;->IO:I

    return p0
.end method

.method public static final synthetic iO(Lcom/sma/smartv3/ui/sport/StepsManager;)Lcom/sma/smartv3/ui/sport/StepsManager$DetectStatus;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/sport/StepsManager;->IiI10X:Lcom/sma/smartv3/ui/sport/StepsManager$DetectStatus;

    return-object p0
.end method


# virtual methods
.method public final I1XOi1()V
    .locals 2

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/StepsManager;->OXO1:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " onPause"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    sget-object v0, Lcom/sma/smartv3/ui/sport/StepsManager$DetectStatus;->PAUSE:Lcom/sma/smartv3/ui/sport/StepsManager$DetectStatus;

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/StepsManager;->IiI10X:Lcom/sma/smartv3/ui/sport/StepsManager$DetectStatus;

    return-void
.end method

.method public final IIX1OXO()V
    .locals 2

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/StepsManager;->OXO1:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " onResume"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    sget-object v0, Lcom/sma/smartv3/ui/sport/StepsManager$DetectStatus;->RESUME:Lcom/sma/smartv3/ui/sport/StepsManager$DetectStatus;

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/StepsManager;->IiI10X:Lcom/sma/smartv3/ui/sport/StepsManager$DetectStatus;

    return-void
.end method

.method public final O10IXXX0X()V
    .locals 3

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/StepsManager;->OXO1:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " onDestroy"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    iget v0, p0, Lcom/sma/smartv3/ui/sport/StepsManager;->O00:I

    const/16 v1, 0x13

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/StepsManager;->XIi00iiXO:Landroid/hardware/SensorManager;

    if-eqz v0, :cond_1

    iget-object v1, p0, Lcom/sma/smartv3/ui/sport/StepsManager;->I0iXXO:Lcom/sma/smartv3/ui/sport/StepsManager$XIi00iiXO;

    iget-object v2, p0, Lcom/sma/smartv3/ui/sport/StepsManager;->XO0O10:Landroid/hardware/Sensor;

    invoke-virtual {v0, v1, v2}, Landroid/hardware/SensorManager;->unregisterListener(Landroid/hardware/SensorEventListener;Landroid/hardware/Sensor;)V

    return-void

    :cond_0
    const/16 v1, 0x12

    if-ne v0, v1, :cond_1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/StepsManager;->XIi00iiXO:Landroid/hardware/SensorManager;

    if-eqz v0, :cond_1

    iget-object v1, p0, Lcom/sma/smartv3/ui/sport/StepsManager;->I0iXXO:Lcom/sma/smartv3/ui/sport/StepsManager$XIi00iiXO;

    iget-object v2, p0, Lcom/sma/smartv3/ui/sport/StepsManager;->iO:Landroid/hardware/Sensor;

    invoke-virtual {v0, v1, v2}, Landroid/hardware/SensorManager;->unregisterListener(Landroid/hardware/SensorEventListener;Landroid/hardware/Sensor;)V

    :cond_1
    return-void
.end method

.method public final X0O()V
    .locals 2

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/StepsManager;->OXO1:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " onEnd"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    sget-object v0, Lcom/sma/smartv3/ui/sport/StepsManager$DetectStatus;->END:Lcom/sma/smartv3/ui/sport/StepsManager$DetectStatus;

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/StepsManager;->IiI10X:Lcom/sma/smartv3/ui/sport/StepsManager$DetectStatus;

    return-void
.end method

.method public final X1ii()Z
    .locals 2

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/StepsManager;->IiI10X:Lcom/sma/smartv3/ui/sport/StepsManager$DetectStatus;

    sget-object v1, Lcom/sma/smartv3/ui/sport/StepsManager$DetectStatus;->START:Lcom/sma/smartv3/ui/sport/StepsManager$DetectStatus;

    if-eq v0, v1, :cond_1

    sget-object v1, Lcom/sma/smartv3/ui/sport/StepsManager$DetectStatus;->RESUME:Lcom/sma/smartv3/ui/sport/StepsManager$DetectStatus;

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method public final XXI()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/ui/sport/StepsManager;->O00:I

    return v0
.end method

.method public final XiOIO()V
    .locals 2

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/StepsManager;->OXO1:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " onStart"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    sget-object v0, Lcom/sma/smartv3/ui/sport/StepsManager$DetectStatus;->START:Lcom/sma/smartv3/ui/sport/StepsManager$DetectStatus;

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/StepsManager;->IiI10X:Lcom/sma/smartv3/ui/sport/StepsManager$DetectStatus;

    const/4 v0, 0x0

    iput v0, p0, Lcom/sma/smartv3/ui/sport/StepsManager;->XOO0ii0:I

    iput v0, p0, Lcom/sma/smartv3/ui/sport/StepsManager;->OIi0:I

    iput v0, p0, Lcom/sma/smartv3/ui/sport/StepsManager;->I0IIOi:I

    iput v0, p0, Lcom/sma/smartv3/ui/sport/StepsManager;->IO:I

    return-void
.end method
