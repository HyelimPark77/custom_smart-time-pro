.class public final Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity$OXO1;
.super Lcom/jieli/jl_filebrowse/interfaces/SimpleFileObserver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;->browToDir(Lcom/jieli/jl_filebrowse/bean/SDCardBean;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic OXO1:Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;

.field public final synthetic XIi00iiXO:Lcom/jieli/jl_filebrowse/bean/SDCardBean;

.field public final synthetic iO:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;Lcom/jieli/jl_filebrowse/bean/SDCardBean;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity$OXO1;->OXO1:Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;

    iput-object p2, p0, Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity$OXO1;->XIi00iiXO:Lcom/jieli/jl_filebrowse/bean/SDCardBean;

    iput-object p3, p0, Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity$OXO1;->iO:Ljava/lang/String;

    invoke-direct {p0}, Lcom/jieli/jl_filebrowse/interfaces/SimpleFileObserver;-><init>()V

    return-void
.end method


# virtual methods
.method public onFileReadFailed(I)V
    .locals 0

    invoke-super {p0, p1}, Lcom/jieli/jl_filebrowse/interfaces/SimpleFileObserver;->onFileReadFailed(I)V

    invoke-static {}, Lcom/jieli/jl_filebrowse/FileBrowseManager;->getInstance()Lcom/jieli/jl_filebrowse/FileBrowseManager;

    move-result-object p1

    invoke-virtual {p1, p0}, Lcom/jieli/jl_filebrowse/FileBrowseManager;->removeFileObserver(Lcom/jieli/jl_filebrowse/interfaces/FileObserver;)V

    return-void
.end method

.method public onFileReadStop(Z)V
    .locals 2

    invoke-super {p0, p1}, Lcom/jieli/jl_filebrowse/interfaces/SimpleFileObserver;->onFileReadStop(Z)V

    invoke-static {}, Lcom/jieli/jl_filebrowse/FileBrowseManager;->getInstance()Lcom/jieli/jl_filebrowse/FileBrowseManager;

    move-result-object p1

    invoke-virtual {p1, p0}, Lcom/jieli/jl_filebrowse/FileBrowseManager;->removeFileObserver(Lcom/jieli/jl_filebrowse/interfaces/FileObserver;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity$OXO1;->OXO1:Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity$OXO1;->XIi00iiXO:Lcom/jieli/jl_filebrowse/bean/SDCardBean;

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity$OXO1;->iO:Ljava/lang/String;

    invoke-static {p1, v0, v1}, Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;->access$browToDir(Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;Lcom/jieli/jl_filebrowse/bean/SDCardBean;Ljava/lang/String;)V

    return-void
.end method

.method public onSdCardStatusChange(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lcom/jieli/jl_filebrowse/bean/SDCardBean;",
            ">;)V"
        }
    .end annotation

    const-string v0, "onLineCards"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, Lcom/jieli/jl_filebrowse/interfaces/SimpleFileObserver;->onSdCardStatusChange(Ljava/util/List;)V

    invoke-static {}, Lcom/jieli/jl_filebrowse/FileBrowseManager;->getInstance()Lcom/jieli/jl_filebrowse/FileBrowseManager;

    move-result-object p1

    invoke-virtual {p1, p0}, Lcom/jieli/jl_filebrowse/FileBrowseManager;->removeFileObserver(Lcom/jieli/jl_filebrowse/interfaces/FileObserver;)V

    return-void
.end method
