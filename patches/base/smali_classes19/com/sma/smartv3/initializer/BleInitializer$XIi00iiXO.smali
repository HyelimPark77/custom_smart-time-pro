.class public final Lcom/sma/smartv3/initializer/BleInitializer$XIi00iiXO;
.super Landroid/telephony/PhoneStateListener;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/sma/smartv3/initializer/BleInitializer;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroid/telephony/PhoneStateListener;-><init>()V

    return-void
.end method


# virtual methods
.method public onCallStateChanged(ILjava/lang/String;)V
    .locals 9

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    invoke-static {}, Lcom/blankj/utilcode/util/AppUtils;->isAppForeground()Z

    move-result v1

    invoke-static {}, Lcom/blankj/utilcode/util/ScreenUtils;->isScreenLock()Z

    move-result v2

    sget-object v3, Lcom/sma/smartv3/initializer/BleInitializer;->IO:Lcom/sma/smartv3/initializer/BleInitializer;

    invoke-static {v3, p1}, Lcom/sma/smartv3/initializer/BleInitializer;->iI(Lcom/sma/smartv3/initializer/BleInitializer;I)Ljava/lang/String;

    move-result-object v4

    invoke-static {}, Lcom/sma/smartv3/initializer/BleInitializer;->XX1Oi()I

    move-result v5

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "BleInitializer PhoneStateListener onCallStateChanged -> isAppForeground:"

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, " isScreenLock:"

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, " state="

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", phoneNumber="

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", "

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/q62;->OI()Z

    move-result v1

    if-nez v1, :cond_0

    return-void

    :cond_0
    const/4 v1, 0x0

    const/4 v2, 0x2

    const-string v4, "IS_CALL_NOTIFICATION_RECEIVE"

    const/4 v5, 0x0

    const-string v6, ""

    const/4 v7, 0x1

    if-eqz p1, :cond_7

    if-eq p1, v7, :cond_3

    if-eq p1, v2, :cond_1

    goto/16 :goto_1

    :cond_1
    invoke-static {v3, v5}, Lcom/sma/smartv3/initializer/BleInitializer;->XXiIiX10(Lcom/sma/smartv3/initializer/BleInitializer;I)V

    sget-object p2, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {p2}, Lcom/android/mltcode/paycertificationapi/a01;->iO()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object p2

    invoke-virtual {p2, v4, v5}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;Z)V

    invoke-static {}, Lcom/sma/smartv3/initializer/BleInitializer;->XX1Oi()I

    move-result p2

    if-ne p2, v7, :cond_2

    invoke-static {v3}, Lcom/sma/smartv3/initializer/BleInitializer;->Ii0X0X(Lcom/sma/smartv3/initializer/BleInitializer;)V

    :cond_2
    invoke-virtual {v3, v1}, Lcom/sma/smartv3/initializer/BleInitializer;->OiXI1OiX0(Lcom/szabh/smable3/entity/BleNotification;)V

    goto :goto_1

    :cond_3
    sget-object v1, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v1}, Lcom/android/mltcode/paycertificationapi/a01;->iO()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v1

    invoke-virtual {v1, v4, v7}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;Z)V

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/q62;->i0iOi()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_5

    if-nez p2, :cond_4

    move-object p2, v6

    :cond_4
    invoke-static {v3, p2}, Lcom/sma/smartv3/initializer/BleInitializer;->X1(Lcom/sma/smartv3/initializer/BleInitializer;Ljava/lang/String;)V

    goto :goto_1

    :cond_5
    if-nez p2, :cond_6

    move-object p2, v6

    :cond_6
    invoke-static {v3, p2}, Lcom/sma/smartv3/initializer/BleInitializer;->X00Xi1X(Lcom/sma/smartv3/initializer/BleInitializer;Ljava/lang/String;)V

    goto :goto_1

    :cond_7
    invoke-static {v3, v7}, Lcom/sma/smartv3/initializer/BleInitializer;->XXiIiX10(Lcom/sma/smartv3/initializer/BleInitializer;I)V

    sget-object v8, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v8}, Lcom/android/mltcode/paycertificationapi/a01;->iO()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v8

    invoke-virtual {v8, v4, v5}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;Z)V

    invoke-static {}, Lcom/sma/smartv3/initializer/BleInitializer;->XX1Oi()I

    move-result v4

    if-ne v4, v7, :cond_b

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/q62;->i0iOi()Z

    move-result v0

    if-eqz v0, :cond_9

    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_9

    if-nez p2, :cond_8

    move-object p2, v6

    :cond_8
    invoke-static {v3, p2}, Lcom/sma/smartv3/initializer/BleInitializer;->IO0II0i(Lcom/sma/smartv3/initializer/BleInitializer;Ljava/lang/String;)V

    goto :goto_0

    :cond_9
    if-nez p2, :cond_a

    move-object p2, v6

    :cond_a
    invoke-static {v3, p2}, Lcom/sma/smartv3/initializer/BleInitializer;->IXOIIIO(Lcom/sma/smartv3/initializer/BleInitializer;Ljava/lang/String;)V

    goto :goto_0

    :cond_b
    invoke-static {}, Lcom/sma/smartv3/initializer/BleInitializer;->XX1Oi()I

    move-result p2

    if-ne p2, v2, :cond_c

    invoke-static {v3}, Lcom/sma/smartv3/initializer/BleInitializer;->Ii0X0X(Lcom/sma/smartv3/initializer/BleInitializer;)V

    :cond_c
    :goto_0
    invoke-virtual {v3, v1}, Lcom/sma/smartv3/initializer/BleInitializer;->OiXI1OiX0(Lcom/szabh/smable3/entity/BleNotification;)V

    :goto_1
    invoke-static {p1}, Lcom/sma/smartv3/initializer/BleInitializer;->IXI(I)V

    return-void
.end method
