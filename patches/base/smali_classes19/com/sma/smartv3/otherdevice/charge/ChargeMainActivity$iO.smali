.class public final Lcom/sma/smartv3/otherdevice/charge/ChargeMainActivity$iO;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/SeekBar$OnSeekBarChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/otherdevice/charge/ChargeMainActivity;->initScreensaver()V
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

    iput-object p1, p0, Lcom/sma/smartv3/otherdevice/charge/ChargeMainActivity$iO;->OXO1:Lcom/sma/smartv3/otherdevice/charge/ChargeMainActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onProgressChanged(Landroid/widget/SeekBar;IZ)V
    .locals 1

    iget-object p1, p0, Lcom/sma/smartv3/otherdevice/charge/ChargeMainActivity$iO;->OXO1:Lcom/sma/smartv3/otherdevice/charge/ChargeMainActivity;

    invoke-static {p1}, Lcom/sma/smartv3/otherdevice/charge/ChargeMainActivity;->access$getTvScreensaverValue(Lcom/sma/smartv3/otherdevice/charge/ChargeMainActivity;)Landroid/widget/TextView;

    move-result-object p1

    iget-object p3, p0, Lcom/sma/smartv3/otherdevice/charge/ChargeMainActivity$iO;->OXO1:Lcom/sma/smartv3/otherdevice/charge/ChargeMainActivity;

    add-int/lit8 p2, p2, 0x3

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    filled-new-array {p2}, [Ljava/lang/Object;

    move-result-object p2

    const v0, 0x7f1403a3

    invoke-virtual {p3, v0, p2}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public onStartTrackingTouch(Landroid/widget/SeekBar;)V
    .locals 0

    return-void
.end method

.method public onStopTrackingTouch(Landroid/widget/SeekBar;)V
    .locals 8

    iget-object p1, p0, Lcom/sma/smartv3/otherdevice/charge/ChargeMainActivity$iO;->OXO1:Lcom/sma/smartv3/otherdevice/charge/ChargeMainActivity;

    invoke-static {p1}, Lcom/sma/smartv3/otherdevice/charge/ChargeMainActivity;->access$getSeekbarScreensaver(Lcom/sma/smartv3/otherdevice/charge/ChargeMainActivity;)Landroid/widget/SeekBar;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/ProgressBar;->getProgress()I

    move-result p1

    add-int/lit8 v3, p1, 0x3

    sget-object v0, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    sget-object v1, Lcom/szabh/smable3/BleKey;->BACK_LIGHT:Lcom/szabh/smable3/BleKey;

    sget-object v2, Lcom/szabh/smable3/BleKeyFlag;->UPDATE:Lcom/szabh/smable3/BleKeyFlag;

    const/16 v6, 0x18

    const/4 v7, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v0 .. v7}, Lcom/szabh/smable3/component/BaseBleConnector;->sendInt8$default(Lcom/szabh/smable3/component/BaseBleConnector;Lcom/szabh/smable3/BleKey;Lcom/szabh/smable3/BleKeyFlag;IZZILjava/lang/Object;)Z

    return-void
.end method
