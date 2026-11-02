.class public final Lcom/sma/smartv3/otherdevice/charge/ChargeMainActivity$XIi00iiXO;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/SeekBar$OnSeekBarChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/otherdevice/charge/ChargeMainActivity;->initLightness()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic OXO1:Lcom/sma/smartv3/otherdevice/charge/ChargeMainActivity;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/otherdevice/charge/ChargeMainActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/otherdevice/charge/ChargeMainActivity$XIi00iiXO;->OXO1:Lcom/sma/smartv3/otherdevice/charge/ChargeMainActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onProgressChanged(Landroid/widget/SeekBar;IZ)V
    .locals 8

    iget-object p1, p0, Lcom/sma/smartv3/otherdevice/charge/ChargeMainActivity$XIi00iiXO;->OXO1:Lcom/sma/smartv3/otherdevice/charge/ChargeMainActivity;

    invoke-static {p1}, Lcom/sma/smartv3/otherdevice/charge/ChargeMainActivity;->access$getTvLow(Lcom/sma/smartv3/otherdevice/charge/ChargeMainActivity;)Landroid/widget/TextView;

    move-result-object p1

    const/4 p3, 0x0

    invoke-virtual {p1, p3}, Landroid/widget/TextView;->setEnabled(Z)V

    iget-object p1, p0, Lcom/sma/smartv3/otherdevice/charge/ChargeMainActivity$XIi00iiXO;->OXO1:Lcom/sma/smartv3/otherdevice/charge/ChargeMainActivity;

    invoke-static {p1}, Lcom/sma/smartv3/otherdevice/charge/ChargeMainActivity;->access$getTvMiddle(Lcom/sma/smartv3/otherdevice/charge/ChargeMainActivity;)Landroid/widget/TextView;

    move-result-object p1

    invoke-virtual {p1, p3}, Landroid/widget/TextView;->setEnabled(Z)V

    iget-object p1, p0, Lcom/sma/smartv3/otherdevice/charge/ChargeMainActivity$XIi00iiXO;->OXO1:Lcom/sma/smartv3/otherdevice/charge/ChargeMainActivity;

    invoke-static {p1}, Lcom/sma/smartv3/otherdevice/charge/ChargeMainActivity;->access$getTvHigh(Lcom/sma/smartv3/otherdevice/charge/ChargeMainActivity;)Landroid/widget/TextView;

    move-result-object p1

    invoke-virtual {p1, p3}, Landroid/widget/TextView;->setEnabled(Z)V

    const/4 p1, 0x1

    if-eqz p2, :cond_3

    if-eq p2, p1, :cond_2

    const/4 p3, 0x2

    if-eq p2, p3, :cond_1

    const/4 p3, 0x3

    if-eq p2, p3, :cond_0

    return-void

    :cond_0
    iget-object p2, p0, Lcom/sma/smartv3/otherdevice/charge/ChargeMainActivity$XIi00iiXO;->OXO1:Lcom/sma/smartv3/otherdevice/charge/ChargeMainActivity;

    invoke-static {p2}, Lcom/sma/smartv3/otherdevice/charge/ChargeMainActivity;->access$getTvHigh(Lcom/sma/smartv3/otherdevice/charge/ChargeMainActivity;)Landroid/widget/TextView;

    move-result-object p2

    invoke-virtual {p2, p1}, Landroid/widget/TextView;->setEnabled(Z)V

    sget-object v0, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    sget-object v1, Lcom/szabh/smable3/BleKey;->SCREEN_BRIGHTNESS_SET:Lcom/szabh/smable3/BleKey;

    sget-object v2, Lcom/szabh/smable3/BleKeyFlag;->UPDATE:Lcom/szabh/smable3/BleKeyFlag;

    const/16 v6, 0x18

    const/4 v7, 0x0

    const/4 v3, 0x4

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v0 .. v7}, Lcom/szabh/smable3/component/BaseBleConnector;->sendInt8$default(Lcom/szabh/smable3/component/BaseBleConnector;Lcom/szabh/smable3/BleKey;Lcom/szabh/smable3/BleKeyFlag;IZZILjava/lang/Object;)Z

    return-void

    :cond_1
    iget-object p2, p0, Lcom/sma/smartv3/otherdevice/charge/ChargeMainActivity$XIi00iiXO;->OXO1:Lcom/sma/smartv3/otherdevice/charge/ChargeMainActivity;

    invoke-static {p2}, Lcom/sma/smartv3/otherdevice/charge/ChargeMainActivity;->access$getTvMiddle(Lcom/sma/smartv3/otherdevice/charge/ChargeMainActivity;)Landroid/widget/TextView;

    move-result-object p2

    invoke-virtual {p2, p1}, Landroid/widget/TextView;->setEnabled(Z)V

    sget-object v0, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    sget-object v1, Lcom/szabh/smable3/BleKey;->SCREEN_BRIGHTNESS_SET:Lcom/szabh/smable3/BleKey;

    sget-object v2, Lcom/szabh/smable3/BleKeyFlag;->UPDATE:Lcom/szabh/smable3/BleKeyFlag;

    const/16 v6, 0x18

    const/4 v7, 0x0

    const/4 v3, 0x2

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v0 .. v7}, Lcom/szabh/smable3/component/BaseBleConnector;->sendInt8$default(Lcom/szabh/smable3/component/BaseBleConnector;Lcom/szabh/smable3/BleKey;Lcom/szabh/smable3/BleKeyFlag;IZZILjava/lang/Object;)Z

    return-void

    :cond_2
    iget-object p2, p0, Lcom/sma/smartv3/otherdevice/charge/ChargeMainActivity$XIi00iiXO;->OXO1:Lcom/sma/smartv3/otherdevice/charge/ChargeMainActivity;

    invoke-static {p2}, Lcom/sma/smartv3/otherdevice/charge/ChargeMainActivity;->access$getTvLow(Lcom/sma/smartv3/otherdevice/charge/ChargeMainActivity;)Landroid/widget/TextView;

    move-result-object p2

    invoke-virtual {p2, p1}, Landroid/widget/TextView;->setEnabled(Z)V

    sget-object v0, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    sget-object v1, Lcom/szabh/smable3/BleKey;->SCREEN_BRIGHTNESS_SET:Lcom/szabh/smable3/BleKey;

    sget-object v2, Lcom/szabh/smable3/BleKeyFlag;->UPDATE:Lcom/szabh/smable3/BleKeyFlag;

    const/16 v6, 0x18

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v0 .. v7}, Lcom/szabh/smable3/component/BaseBleConnector;->sendInt8$default(Lcom/szabh/smable3/component/BaseBleConnector;Lcom/szabh/smable3/BleKey;Lcom/szabh/smable3/BleKeyFlag;IZZILjava/lang/Object;)Z

    return-void

    :cond_3
    iget-object p2, p0, Lcom/sma/smartv3/otherdevice/charge/ChargeMainActivity$XIi00iiXO;->OXO1:Lcom/sma/smartv3/otherdevice/charge/ChargeMainActivity;

    invoke-static {p2}, Lcom/sma/smartv3/otherdevice/charge/ChargeMainActivity;->access$getSeekbarLightness(Lcom/sma/smartv3/otherdevice/charge/ChargeMainActivity;)Lcom/sma/smartv3/view/ScaleSeekBar;

    move-result-object p2

    invoke-virtual {p2, p1}, Landroid/widget/ProgressBar;->setProgress(I)V

    iget-object p2, p0, Lcom/sma/smartv3/otherdevice/charge/ChargeMainActivity$XIi00iiXO;->OXO1:Lcom/sma/smartv3/otherdevice/charge/ChargeMainActivity;

    invoke-static {p2}, Lcom/sma/smartv3/otherdevice/charge/ChargeMainActivity;->access$getTvLow(Lcom/sma/smartv3/otherdevice/charge/ChargeMainActivity;)Landroid/widget/TextView;

    move-result-object p2

    invoke-virtual {p2, p1}, Landroid/widget/TextView;->setEnabled(Z)V

    sget-object v0, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    sget-object v1, Lcom/szabh/smable3/BleKey;->SCREEN_BRIGHTNESS_SET:Lcom/szabh/smable3/BleKey;

    sget-object v2, Lcom/szabh/smable3/BleKeyFlag;->UPDATE:Lcom/szabh/smable3/BleKeyFlag;

    const/16 v6, 0x18

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v0 .. v7}, Lcom/szabh/smable3/component/BaseBleConnector;->sendInt8$default(Lcom/szabh/smable3/component/BaseBleConnector;Lcom/szabh/smable3/BleKey;Lcom/szabh/smable3/BleKeyFlag;IZZILjava/lang/Object;)Z

    return-void
.end method

.method public onStartTrackingTouch(Landroid/widget/SeekBar;)V
    .locals 0

    return-void
.end method

.method public onStopTrackingTouch(Landroid/widget/SeekBar;)V
    .locals 0

    return-void
.end method
