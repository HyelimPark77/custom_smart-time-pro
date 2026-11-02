.class public Lcom/jieli/jl_filebrowse/interfaces/SimpleFileObserver;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/jieli/jl_filebrowse/interfaces/FileObserver;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public OnFlayCallback(Z)V
    .locals 0

    return-void
.end method

.method public onFileReadFailed(I)V
    .locals 0

    return-void
.end method

.method public onFileReadStart()V
    .locals 0

    return-void
.end method

.method public onFileReadStop(Z)V
    .locals 0

    return-void
.end method

.method public onFileReceiver(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/jieli/jl_filebrowse/bean/FileStruct;",
            ">;)V"
        }
    .end annotation

    return-void
.end method

.method public onSdCardStatusChange(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/jieli/jl_filebrowse/bean/SDCardBean;",
            ">;)V"
        }
    .end annotation

    return-void
.end method
