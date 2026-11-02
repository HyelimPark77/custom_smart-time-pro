.class Lcom/jieli/jl_filebrowse/FileBrowseManager$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/jieli/jl_filebrowse/interfaces/OperatCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/jieli/jl_filebrowse/FileBrowseManager;->startLrcRead(Landroid/content/Context;Lcom/jieli/jl_filebrowse/bean/FileStruct;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/jieli/jl_filebrowse/FileBrowseManager;


# direct methods
.method public constructor <init>(Lcom/jieli/jl_filebrowse/FileBrowseManager;)V
    .locals 0

    iput-object p1, p0, Lcom/jieli/jl_filebrowse/FileBrowseManager$5;->a:Lcom/jieli/jl_filebrowse/FileBrowseManager;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onError(I)V
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_filebrowse/FileBrowseManager$5;->a:Lcom/jieli/jl_filebrowse/FileBrowseManager;

    invoke-virtual {v0, p1}, Lcom/jieli/jl_filebrowse/FileBrowseManager;->onLrcReadFailed(I)V

    return-void
.end method

.method public onSuccess()V
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_filebrowse/FileBrowseManager$5;->a:Lcom/jieli/jl_filebrowse/FileBrowseManager;

    invoke-virtual {v0}, Lcom/jieli/jl_filebrowse/FileBrowseManager;->onLrcReadStart()V

    return-void
.end method
