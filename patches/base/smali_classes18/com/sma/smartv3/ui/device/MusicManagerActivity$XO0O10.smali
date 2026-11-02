.class public final Lcom/sma/smartv3/ui/device/MusicManagerActivity$XO0O10;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/sma/smartv3/ui/device/XIi00iiXO$OXO1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/device/MusicManagerActivity;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic OXO1:Lcom/sma/smartv3/ui/device/MusicManagerActivity;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/device/MusicManagerActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/MusicManagerActivity$XO0O10;->OXO1:Lcom/sma/smartv3/ui/device/MusicManagerActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public I0IIOi(II)V
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/MusicManagerActivity$XO0O10;->OXO1:Lcom/sma/smartv3/ui/device/MusicManagerActivity;

    invoke-static {v0, p1, p2}, Lcom/sma/smartv3/ui/device/MusicManagerActivity;->access$refreshTaskPanel(Lcom/sma/smartv3/ui/device/MusicManagerActivity;II)V

    return-void
.end method

.method public I0iXXO(I)V
    .locals 1

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/MusicManagerActivity$XO0O10;->OXO1:Lcom/sma/smartv3/ui/device/MusicManagerActivity;

    invoke-virtual {p1}, Lcom/sma/smartv3/ui/device/MusicManagerActivity;->getTaskPanel()Landroid/view/View;

    move-result-object p1

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/MusicManagerActivity$XO0O10;->OXO1:Lcom/sma/smartv3/ui/device/MusicManagerActivity;

    invoke-virtual {p1}, Lcom/sma/smartv3/ui/device/MusicManagerActivity;->onMusicFileTransferStop()V

    return-void
.end method

.method public IiI10X(I)V
    .locals 2

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/MusicManagerActivity$XO0O10;->OXO1:Lcom/sma/smartv3/ui/device/MusicManagerActivity;

    const/4 v1, 0x0

    invoke-static {v0, p1, v1}, Lcom/sma/smartv3/ui/device/MusicManagerActivity;->access$refreshTaskPanel(Lcom/sma/smartv3/ui/device/MusicManagerActivity;II)V

    return-void
.end method

.method public OIi0(IZ)V
    .locals 1

    if-eqz p2, :cond_0

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/MusicManagerActivity$XO0O10;->OXO1:Lcom/sma/smartv3/ui/device/MusicManagerActivity;

    invoke-virtual {p1}, Lcom/sma/smartv3/ui/device/MusicManagerActivity;->getTaskPanel()Landroid/view/View;

    move-result-object p1

    const/16 p2, 0x8

    invoke-virtual {p1, p2}, Landroid/view/View;->setVisibility(I)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/MusicManagerActivity$XO0O10;->OXO1:Lcom/sma/smartv3/ui/device/MusicManagerActivity;

    invoke-virtual {p1}, Lcom/sma/smartv3/ui/device/MusicManagerActivity;->onMusicFileTransferStop()V

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/MusicManagerActivity$XO0O10;->OXO1:Lcom/sma/smartv3/ui/device/MusicManagerActivity;

    invoke-static {p1}, Lcom/sma/smartv3/ui/device/MusicManagerActivity;->access$getSDCardInfo(Lcom/sma/smartv3/ui/device/MusicManagerActivity;)V

    :cond_0
    sget-object p1, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object p2, p0, Lcom/sma/smartv3/ui/device/MusicManagerActivity$XO0O10;->OXO1:Lcom/sma/smartv3/ui/device/MusicManagerActivity;

    invoke-virtual {p2}, Lcom/sma/smartv3/ui/device/MusicManagerActivity;->getTAG()Ljava/lang/String;

    move-result-object p2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, " onFileTransferFinish"

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/MusicManagerActivity$XO0O10;->OXO1:Lcom/sma/smartv3/ui/device/MusicManagerActivity;

    invoke-virtual {p1}, Lcom/sma/smartv3/ui/device/MusicManagerActivity;->getDeviceFileList()V

    return-void
.end method

.method public XIi00iiXO(I)V
    .locals 0

    invoke-super {p0, p1}, Lcom/sma/smartv3/ui/device/XIi00iiXO$OXO1;->XIi00iiXO(I)V

    sget-object p1, Lcom/sma/smartv3/ui/device/XIi00iiXO;->OXO1:Lcom/sma/smartv3/ui/device/XIi00iiXO;

    invoke-virtual {p1}, Lcom/sma/smartv3/ui/device/XIi00iiXO;->I1()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/MusicManagerActivity$XO0O10;->OXO1:Lcom/sma/smartv3/ui/device/MusicManagerActivity;

    invoke-virtual {p1}, Lcom/sma/smartv3/ui/device/MusicManagerActivity;->dismissLoadPopup()V

    :cond_0
    iget-object p1, p0, Lcom/sma/smartv3/ui/device/MusicManagerActivity$XO0O10;->OXO1:Lcom/sma/smartv3/ui/device/MusicManagerActivity;

    invoke-static {p1}, Lcom/sma/smartv3/ui/device/MusicManagerActivity;->access$getSDCardInfo(Lcom/sma/smartv3/ui/device/MusicManagerActivity;)V

    return-void
.end method

.method public XO0O10(IILjava/lang/String;)V
    .locals 3

    const-string v0, "msg"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/MusicManagerActivity$XO0O10;->OXO1:Lcom/sma/smartv3/ui/device/MusicManagerActivity;

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/device/MusicManagerActivity;->getTvCancel()Landroid/view/View;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/MusicManagerActivity$XO0O10;->OXO1:Lcom/sma/smartv3/ui/device/MusicManagerActivity;

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/device/MusicManagerActivity;->getTvRetry()Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/MusicManagerActivity$XO0O10;->OXO1:Lcom/sma/smartv3/ui/device/MusicManagerActivity;

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/device/MusicManagerActivity;->getTvProgressTip()Landroid/widget/TextView;

    move-result-object v0

    const v2, 0x7f140fc5

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(I)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/MusicManagerActivity$XO0O10;->OXO1:Lcom/sma/smartv3/ui/device/MusicManagerActivity;

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/device/MusicManagerActivity;->getPbProgress()Landroid/widget/ProgressBar;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setProgress(I)V

    sget-object v0, Lcom/sma/smartv3/ui/device/XIi00iiXO;->OXO1:Lcom/sma/smartv3/ui/device/XIi00iiXO;

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/device/XIi00iiXO;->OII()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/android/mltcode/paycertificationapi/bz5;

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/bz5;->IiI10X()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "\n"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, ":"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-array p2, v1, [Ljava/lang/Object;

    invoke-static {p1, p2}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method
