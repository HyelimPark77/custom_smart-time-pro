.class public final Lcom/sma/smartv3/ui/sport/StepsManager$XIi00iiXO;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/hardware/SensorEventListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/sport/StepsManager;-><init>(Landroid/content/Context;Lcom/sma/smartv3/ui/sport/StepsManager$OXO1;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic IO:Lcom/sma/smartv3/ui/sport/StepsManager;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/sport/StepsManager;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/sport/StepsManager$XIi00iiXO;->IO:Lcom/sma/smartv3/ui/sport/StepsManager;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAccuracyChanged(Landroid/hardware/Sensor;I)V
    .locals 0

    return-void
.end method

.method public onSensorChanged(Landroid/hardware/SensorEvent;)V
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    iget-object v2, v0, Lcom/sma/smartv3/ui/sport/StepsManager$XIi00iiXO;->IO:Lcom/sma/smartv3/ui/sport/StepsManager;

    invoke-static {v2}, Lcom/sma/smartv3/ui/sport/StepsManager;->iO(Lcom/sma/smartv3/ui/sport/StepsManager;)Lcom/sma/smartv3/ui/sport/StepsManager$DetectStatus;

    move-result-object v2

    sget-object v3, Lcom/sma/smartv3/ui/sport/StepsManager$DetectStatus;->END:Lcom/sma/smartv3/ui/sport/StepsManager$DetectStatus;

    const-string v4, " c="

    const-string v5, " p="

    const-string v6, " f="

    const-string v7, " l="

    const-string v8, " s="

    const-string v9, " ev:"

    if-eq v2, v3, :cond_a

    iget-object v2, v0, Lcom/sma/smartv3/ui/sport/StepsManager$XIi00iiXO;->IO:Lcom/sma/smartv3/ui/sport/StepsManager;

    invoke-static {v2}, Lcom/sma/smartv3/ui/sport/StepsManager;->OXO1(Lcom/sma/smartv3/ui/sport/StepsManager;)I

    move-result v2

    const/16 v3, 0x13

    const/4 v11, 0x0

    if-ne v2, v3, :cond_7

    if-eqz v1, :cond_0

    iget-object v2, v1, Landroid/hardware/SensorEvent;->values:[F

    if-eqz v2, :cond_0

    aget v2, v2, v11

    float-to-int v2, v2

    goto :goto_0

    :cond_0
    move v2, v11

    :goto_0
    iget-object v3, v0, Lcom/sma/smartv3/ui/sport/StepsManager$XIi00iiXO;->IO:Lcom/sma/smartv3/ui/sport/StepsManager;

    invoke-static {v3}, Lcom/sma/smartv3/ui/sport/StepsManager;->XO0O10(Lcom/sma/smartv3/ui/sport/StepsManager;)I

    move-result v3

    if-nez v3, :cond_1

    iget-object v3, v0, Lcom/sma/smartv3/ui/sport/StepsManager$XIi00iiXO;->IO:Lcom/sma/smartv3/ui/sport/StepsManager;

    invoke-static {v3, v2}, Lcom/sma/smartv3/ui/sport/StepsManager;->IO(Lcom/sma/smartv3/ui/sport/StepsManager;I)V

    :cond_1
    iget-object v3, v0, Lcom/sma/smartv3/ui/sport/StepsManager$XIi00iiXO;->IO:Lcom/sma/smartv3/ui/sport/StepsManager;

    invoke-static {v3}, Lcom/sma/smartv3/ui/sport/StepsManager;->XO0O10(Lcom/sma/smartv3/ui/sport/StepsManager;)I

    move-result v3

    sub-int v3, v2, v3

    iget-object v12, v0, Lcom/sma/smartv3/ui/sport/StepsManager$XIi00iiXO;->IO:Lcom/sma/smartv3/ui/sport/StepsManager;

    invoke-static {v12}, Lcom/sma/smartv3/ui/sport/StepsManager;->XOO0ii0(Lcom/sma/smartv3/ui/sport/StepsManager;)I

    move-result v12

    sub-int/2addr v3, v12

    if-gez v3, :cond_4

    iget-object v3, v0, Lcom/sma/smartv3/ui/sport/StepsManager$XIi00iiXO;->IO:Lcom/sma/smartv3/ui/sport/StepsManager;

    invoke-static {v3, v11}, Lcom/sma/smartv3/ui/sport/StepsManager;->I0iXXO(Lcom/sma/smartv3/ui/sport/StepsManager;I)V

    iget-object v3, v0, Lcom/sma/smartv3/ui/sport/StepsManager$XIi00iiXO;->IO:Lcom/sma/smartv3/ui/sport/StepsManager;

    if-lez v2, :cond_2

    invoke-static {v3}, Lcom/sma/smartv3/ui/sport/StepsManager;->XIi00iiXO(Lcom/sma/smartv3/ui/sport/StepsManager;)I

    move-result v11

    sub-int v11, v2, v11

    goto :goto_1

    :cond_2
    invoke-static {v3}, Lcom/sma/smartv3/ui/sport/StepsManager;->XIi00iiXO(Lcom/sma/smartv3/ui/sport/StepsManager;)I

    move-result v11

    add-int/2addr v11, v2

    :goto_1
    invoke-static {v3, v11}, Lcom/sma/smartv3/ui/sport/StepsManager;->IO(Lcom/sma/smartv3/ui/sport/StepsManager;I)V

    sget-object v3, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v11, v0, Lcom/sma/smartv3/ui/sport/StepsManager$XIi00iiXO;->IO:Lcom/sma/smartv3/ui/sport/StepsManager;

    invoke-static {v11}, Lcom/sma/smartv3/ui/sport/StepsManager;->I0IIOi(Lcom/sma/smartv3/ui/sport/StepsManager;)Ljava/lang/String;

    move-result-object v11

    iget-object v12, v0, Lcom/sma/smartv3/ui/sport/StepsManager$XIi00iiXO;->IO:Lcom/sma/smartv3/ui/sport/StepsManager;

    invoke-static {v12}, Lcom/sma/smartv3/ui/sport/StepsManager;->OXO1(Lcom/sma/smartv3/ui/sport/StepsManager;)I

    move-result v12

    if-eqz v1, :cond_3

    iget-object v13, v1, Landroid/hardware/SensorEvent;->values:[F

    goto :goto_2

    :cond_3
    const/4 v13, 0x0

    :goto_2
    invoke-static {v13}, Ljava/util/Arrays;->toString([F)Ljava/lang/String;

    move-result-object v13

    iget-object v14, v0, Lcom/sma/smartv3/ui/sport/StepsManager$XIi00iiXO;->IO:Lcom/sma/smartv3/ui/sport/StepsManager;

    invoke-static {v14}, Lcom/sma/smartv3/ui/sport/StepsManager;->iO(Lcom/sma/smartv3/ui/sport/StepsManager;)Lcom/sma/smartv3/ui/sport/StepsManager$DetectStatus;

    move-result-object v14

    iget-object v15, v0, Lcom/sma/smartv3/ui/sport/StepsManager$XIi00iiXO;->IO:Lcom/sma/smartv3/ui/sport/StepsManager;

    invoke-static {v15}, Lcom/sma/smartv3/ui/sport/StepsManager;->O00(Lcom/sma/smartv3/ui/sport/StepsManager;)I

    move-result v15

    iget-object v10, v0, Lcom/sma/smartv3/ui/sport/StepsManager$XIi00iiXO;->IO:Lcom/sma/smartv3/ui/sport/StepsManager;

    invoke-static {v10}, Lcom/sma/smartv3/ui/sport/StepsManager;->XO0O10(Lcom/sma/smartv3/ui/sport/StepsManager;)I

    move-result v10

    iget-object v1, v0, Lcom/sma/smartv3/ui/sport/StepsManager$XIi00iiXO;->IO:Lcom/sma/smartv3/ui/sport/StepsManager;

    invoke-static {v1}, Lcom/sma/smartv3/ui/sport/StepsManager;->XOO0ii0(Lcom/sma/smartv3/ui/sport/StepsManager;)I

    move-result v1

    move/from16 v16, v2

    iget-object v2, v0, Lcom/sma/smartv3/ui/sport/StepsManager$XIi00iiXO;->IO:Lcom/sma/smartv3/ui/sport/StepsManager;

    invoke-static {v2}, Lcom/sma/smartv3/ui/sport/StepsManager;->XIi00iiXO(Lcom/sma/smartv3/ui/sport/StepsManager;)I

    move-result v2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v11, " error onSensorChanged -> cst:"

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v15}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    :goto_3
    move-object/from16 v0, p0

    goto :goto_4

    :cond_4
    move/from16 v16, v2

    goto :goto_3

    :goto_4
    iget-object v1, v0, Lcom/sma/smartv3/ui/sport/StepsManager$XIi00iiXO;->IO:Lcom/sma/smartv3/ui/sport/StepsManager;

    invoke-virtual {v1}, Lcom/sma/smartv3/ui/sport/StepsManager;->X1ii()Z

    move-result v1

    if-eqz v1, :cond_5

    iget-object v1, v0, Lcom/sma/smartv3/ui/sport/StepsManager$XIi00iiXO;->IO:Lcom/sma/smartv3/ui/sport/StepsManager;

    invoke-static {v1}, Lcom/sma/smartv3/ui/sport/StepsManager;->XO0O10(Lcom/sma/smartv3/ui/sport/StepsManager;)I

    move-result v2

    sub-int v2, v16, v2

    iget-object v3, v0, Lcom/sma/smartv3/ui/sport/StepsManager$XIi00iiXO;->IO:Lcom/sma/smartv3/ui/sport/StepsManager;

    invoke-static {v3}, Lcom/sma/smartv3/ui/sport/StepsManager;->XOO0ii0(Lcom/sma/smartv3/ui/sport/StepsManager;)I

    move-result v3

    sub-int/2addr v2, v3

    invoke-static {v1, v2}, Lcom/sma/smartv3/ui/sport/StepsManager;->OIi0(Lcom/sma/smartv3/ui/sport/StepsManager;I)V

    iget-object v1, v0, Lcom/sma/smartv3/ui/sport/StepsManager$XIi00iiXO;->IO:Lcom/sma/smartv3/ui/sport/StepsManager;

    invoke-static {v1}, Lcom/sma/smartv3/ui/sport/StepsManager;->IiI10X(Lcom/sma/smartv3/ui/sport/StepsManager;)Lcom/sma/smartv3/ui/sport/StepsManager$OXO1;

    move-result-object v1

    if-eqz v1, :cond_6

    iget-object v2, v0, Lcom/sma/smartv3/ui/sport/StepsManager$XIi00iiXO;->IO:Lcom/sma/smartv3/ui/sport/StepsManager;

    invoke-static {v2}, Lcom/sma/smartv3/ui/sport/StepsManager;->XIi00iiXO(Lcom/sma/smartv3/ui/sport/StepsManager;)I

    move-result v2

    invoke-interface {v1, v2}, Lcom/sma/smartv3/ui/sport/StepsManager$OXO1;->OXO1(I)V

    goto :goto_5

    :cond_5
    iget-object v1, v0, Lcom/sma/smartv3/ui/sport/StepsManager$XIi00iiXO;->IO:Lcom/sma/smartv3/ui/sport/StepsManager;

    invoke-static {v1}, Lcom/sma/smartv3/ui/sport/StepsManager;->XOO0ii0(Lcom/sma/smartv3/ui/sport/StepsManager;)I

    move-result v2

    iget-object v3, v0, Lcom/sma/smartv3/ui/sport/StepsManager$XIi00iiXO;->IO:Lcom/sma/smartv3/ui/sport/StepsManager;

    invoke-static {v3}, Lcom/sma/smartv3/ui/sport/StepsManager;->O00(Lcom/sma/smartv3/ui/sport/StepsManager;)I

    move-result v3

    sub-int v3, v16, v3

    add-int/2addr v2, v3

    invoke-static {v1, v2}, Lcom/sma/smartv3/ui/sport/StepsManager;->I0iXXO(Lcom/sma/smartv3/ui/sport/StepsManager;I)V

    :cond_6
    :goto_5
    iget-object v1, v0, Lcom/sma/smartv3/ui/sport/StepsManager$XIi00iiXO;->IO:Lcom/sma/smartv3/ui/sport/StepsManager;

    move/from16 v2, v16

    invoke-static {v1, v2}, Lcom/sma/smartv3/ui/sport/StepsManager;->OIX0iXi(Lcom/sma/smartv3/ui/sport/StepsManager;I)V

    goto :goto_6

    :cond_7
    iget-object v1, v0, Lcom/sma/smartv3/ui/sport/StepsManager$XIi00iiXO;->IO:Lcom/sma/smartv3/ui/sport/StepsManager;

    invoke-static {v1}, Lcom/sma/smartv3/ui/sport/StepsManager;->OXO1(Lcom/sma/smartv3/ui/sport/StepsManager;)I

    move-result v1

    const/16 v2, 0x12

    if-ne v1, v2, :cond_9

    iget-object v1, v0, Lcom/sma/smartv3/ui/sport/StepsManager$XIi00iiXO;->IO:Lcom/sma/smartv3/ui/sport/StepsManager;

    invoke-virtual {v1}, Lcom/sma/smartv3/ui/sport/StepsManager;->X1ii()Z

    move-result v1

    if-eqz v1, :cond_8

    iget-object v1, v0, Lcom/sma/smartv3/ui/sport/StepsManager$XIi00iiXO;->IO:Lcom/sma/smartv3/ui/sport/StepsManager;

    invoke-static {v1}, Lcom/sma/smartv3/ui/sport/StepsManager;->IiI10X(Lcom/sma/smartv3/ui/sport/StepsManager;)Lcom/sma/smartv3/ui/sport/StepsManager$OXO1;

    move-result-object v1

    if-eqz v1, :cond_a

    iget-object v2, v0, Lcom/sma/smartv3/ui/sport/StepsManager$XIi00iiXO;->IO:Lcom/sma/smartv3/ui/sport/StepsManager;

    invoke-static {v2}, Lcom/sma/smartv3/ui/sport/StepsManager;->XIi00iiXO(Lcom/sma/smartv3/ui/sport/StepsManager;)I

    move-result v2

    iget-object v3, v0, Lcom/sma/smartv3/ui/sport/StepsManager$XIi00iiXO;->IO:Lcom/sma/smartv3/ui/sport/StepsManager;

    add-int/lit8 v10, v2, 0x1

    invoke-static {v3, v10}, Lcom/sma/smartv3/ui/sport/StepsManager;->OIi0(Lcom/sma/smartv3/ui/sport/StepsManager;I)V

    invoke-interface {v1, v2}, Lcom/sma/smartv3/ui/sport/StepsManager$OXO1;->OXO1(I)V

    goto :goto_6

    :cond_8
    iget-object v1, v0, Lcom/sma/smartv3/ui/sport/StepsManager$XIi00iiXO;->IO:Lcom/sma/smartv3/ui/sport/StepsManager;

    invoke-static {v1}, Lcom/sma/smartv3/ui/sport/StepsManager;->XOO0ii0(Lcom/sma/smartv3/ui/sport/StepsManager;)I

    move-result v1

    iget-object v2, v0, Lcom/sma/smartv3/ui/sport/StepsManager$XIi00iiXO;->IO:Lcom/sma/smartv3/ui/sport/StepsManager;

    add-int/lit8 v1, v1, 0x1

    invoke-static {v2, v1}, Lcom/sma/smartv3/ui/sport/StepsManager;->I0iXXO(Lcom/sma/smartv3/ui/sport/StepsManager;I)V

    goto :goto_6

    :cond_9
    iget-object v1, v0, Lcom/sma/smartv3/ui/sport/StepsManager$XIi00iiXO;->IO:Lcom/sma/smartv3/ui/sport/StepsManager;

    invoke-static {v1}, Lcom/sma/smartv3/ui/sport/StepsManager;->IiI10X(Lcom/sma/smartv3/ui/sport/StepsManager;)Lcom/sma/smartv3/ui/sport/StepsManager$OXO1;

    move-result-object v1

    if-eqz v1, :cond_a

    invoke-interface {v1, v11}, Lcom/sma/smartv3/ui/sport/StepsManager$OXO1;->OXO1(I)V

    :cond_a
    :goto_6
    iget-object v1, v0, Lcom/sma/smartv3/ui/sport/StepsManager$XIi00iiXO;->IO:Lcom/sma/smartv3/ui/sport/StepsManager;

    invoke-static {v1}, Lcom/sma/smartv3/ui/sport/StepsManager;->I0IIOi(Lcom/sma/smartv3/ui/sport/StepsManager;)Ljava/lang/String;

    move-result-object v1

    iget-object v2, v0, Lcom/sma/smartv3/ui/sport/StepsManager$XIi00iiXO;->IO:Lcom/sma/smartv3/ui/sport/StepsManager;

    invoke-static {v2}, Lcom/sma/smartv3/ui/sport/StepsManager;->OXO1(Lcom/sma/smartv3/ui/sport/StepsManager;)I

    move-result v2

    if-eqz p1, :cond_b

    move-object/from16 v3, p1

    iget-object v10, v3, Landroid/hardware/SensorEvent;->values:[F

    goto :goto_7

    :cond_b
    const/4 v10, 0x0

    :goto_7
    invoke-static {v10}, Ljava/util/Arrays;->toString([F)Ljava/lang/String;

    move-result-object v3

    iget-object v10, v0, Lcom/sma/smartv3/ui/sport/StepsManager$XIi00iiXO;->IO:Lcom/sma/smartv3/ui/sport/StepsManager;

    invoke-static {v10}, Lcom/sma/smartv3/ui/sport/StepsManager;->iO(Lcom/sma/smartv3/ui/sport/StepsManager;)Lcom/sma/smartv3/ui/sport/StepsManager$DetectStatus;

    move-result-object v10

    iget-object v11, v0, Lcom/sma/smartv3/ui/sport/StepsManager$XIi00iiXO;->IO:Lcom/sma/smartv3/ui/sport/StepsManager;

    invoke-static {v11}, Lcom/sma/smartv3/ui/sport/StepsManager;->O00(Lcom/sma/smartv3/ui/sport/StepsManager;)I

    move-result v11

    iget-object v12, v0, Lcom/sma/smartv3/ui/sport/StepsManager$XIi00iiXO;->IO:Lcom/sma/smartv3/ui/sport/StepsManager;

    invoke-static {v12}, Lcom/sma/smartv3/ui/sport/StepsManager;->XO0O10(Lcom/sma/smartv3/ui/sport/StepsManager;)I

    move-result v12

    iget-object v13, v0, Lcom/sma/smartv3/ui/sport/StepsManager$XIi00iiXO;->IO:Lcom/sma/smartv3/ui/sport/StepsManager;

    invoke-static {v13}, Lcom/sma/smartv3/ui/sport/StepsManager;->XOO0ii0(Lcom/sma/smartv3/ui/sport/StepsManager;)I

    move-result v13

    iget-object v14, v0, Lcom/sma/smartv3/ui/sport/StepsManager$XIi00iiXO;->IO:Lcom/sma/smartv3/ui/sport/StepsManager;

    invoke-static {v14}, Lcom/sma/smartv3/ui/sport/StepsManager;->XIi00iiXO(Lcom/sma/smartv3/ui/sport/StepsManager;)I

    move-result v14

    new-instance v15, Ljava/lang/StringBuilder;

    invoke-direct {v15}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v15, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " onSensorChanged -> cst:"

    invoke-virtual {v15, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v12}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v14}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    return-void
.end method
