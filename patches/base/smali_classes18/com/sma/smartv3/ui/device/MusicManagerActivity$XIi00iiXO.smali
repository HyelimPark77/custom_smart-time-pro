.class public final Lcom/sma/smartv3/ui/device/MusicManagerActivity$XIi00iiXO;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/jieli/jl_filebrowse/interfaces/DeleteCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/device/MusicManagerActivity;->deleteFile(I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic OXO1:Lcom/sma/smartv3/ui/device/MusicManagerActivity;

.field public final synthetic XIi00iiXO:I


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/device/MusicManagerActivity;I)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/MusicManagerActivity$XIi00iiXO;->OXO1:Lcom/sma/smartv3/ui/device/MusicManagerActivity;

    iput p2, p0, Lcom/sma/smartv3/ui/device/MusicManagerActivity$XIi00iiXO;->XIi00iiXO:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onError(ILcom/jieli/jl_filebrowse/bean/FileStruct;)V
    .locals 3

    const-string v0, "file"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/MusicManagerActivity$XIi00iiXO;->OXO1:Lcom/sma/smartv3/ui/device/MusicManagerActivity;

    invoke-virtual {v1}, Lcom/sma/smartv3/ui/device/MusicManagerActivity;->getTAG()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " -> onDeviceFileDeleteError "

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", "

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/MusicManagerActivity$XIi00iiXO;->OXO1:Lcom/sma/smartv3/ui/device/MusicManagerActivity;

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/device/MusicManagerActivity;->dismissLoadPopup()V

    invoke-virtual {p2}, Lcom/jieli/jl_filebrowse/bean/FileStruct;->getName()Ljava/lang/String;

    move-result-object p2

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/MusicManagerActivity$XIi00iiXO;->OXO1:Lcom/sma/smartv3/ui/device/MusicManagerActivity;

    const v1, 0x7f140bb2

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, "-"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 p2, 0x0

    new-array p2, p2, [Ljava/lang/Object;

    invoke-static {p1, p2}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public onFinish()V
    .locals 3

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/MusicManagerActivity$XIi00iiXO;->OXO1:Lcom/sma/smartv3/ui/device/MusicManagerActivity;

    invoke-virtual {v1}, Lcom/sma/smartv3/ui/device/MusicManagerActivity;->getTAG()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " -> onDeviceFileDeleteFinish"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/MusicManagerActivity$XIi00iiXO;->OXO1:Lcom/sma/smartv3/ui/device/MusicManagerActivity;

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/device/MusicManagerActivity;->getMFiles()Ljava/util/List;

    move-result-object v0

    iget v1, p0, Lcom/sma/smartv3/ui/device/MusicManagerActivity$XIi00iiXO;->XIi00iiXO:I

    invoke-interface {v0, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/MusicManagerActivity$XIi00iiXO;->OXO1:Lcom/sma/smartv3/ui/device/MusicManagerActivity;

    invoke-static {v0}, Lcom/sma/smartv3/ui/device/MusicManagerActivity;->access$showList(Lcom/sma/smartv3/ui/device/MusicManagerActivity;)V

    return-void
.end method

.method public onSuccess(Lcom/jieli/jl_filebrowse/bean/FileStruct;)V
    .locals 3

    const-string v0, "p0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/MusicManagerActivity$XIi00iiXO;->OXO1:Lcom/sma/smartv3/ui/device/MusicManagerActivity;

    invoke-virtual {v1}, Lcom/sma/smartv3/ui/device/MusicManagerActivity;->getTAG()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " -> onDeviceFileDelete "

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    return-void
.end method
