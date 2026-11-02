.class public interface abstract Lcom/jieli/jl_filebrowse/interfaces/OnFileBrowseCallback;
.super Ljava/lang/Object;
.source "SourceFile"


# virtual methods
.method public abstract OnFlayCallback(Z)V
.end method

.method public abstract onBluetoothConnectionChange(Landroid/bluetooth/BluetoothDevice;I)V
.end method

.method public abstract onFileDataReceive([B)V
.end method

.method public abstract onFileReadFailed(I)V
.end method

.method public abstract onFileReadStart()V
.end method

.method public abstract onFileReadStop(Z)V
.end method

.method public abstract onFileStructureChange(Lcom/jieli/jl_filebrowse/bean/FileChangeInfo;)V
.end method

.method public abstract onSdCardChange(Ljava/util/List;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/jieli/jl_filebrowse/bean/SDCardBean;",
            ">;)V"
        }
    .end annotation
.end method
