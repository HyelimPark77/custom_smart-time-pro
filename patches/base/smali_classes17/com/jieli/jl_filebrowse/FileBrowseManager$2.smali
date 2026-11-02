.class Lcom/jieli/jl_filebrowse/FileBrowseManager$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/jieli/jl_filebrowse/interfaces/OperatCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/jieli/jl_filebrowse/FileBrowseManager;->formatDevice(Lcom/jieli/jl_filebrowse/bean/SDCardBean;Lcom/jieli/jl_filebrowse/interfaces/OperatCallback;)I
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/jieli/jl_filebrowse/bean/SDCardBean;

.field public final synthetic b:Lcom/jieli/jl_filebrowse/interfaces/OperatCallback;

.field public final synthetic c:Lcom/jieli/jl_filebrowse/FileBrowseManager;


# direct methods
.method public constructor <init>(Lcom/jieli/jl_filebrowse/FileBrowseManager;Lcom/jieli/jl_filebrowse/bean/SDCardBean;Lcom/jieli/jl_filebrowse/interfaces/OperatCallback;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lcom/jieli/jl_filebrowse/FileBrowseManager$2;->c:Lcom/jieli/jl_filebrowse/FileBrowseManager;

    iput-object p2, p0, Lcom/jieli/jl_filebrowse/FileBrowseManager$2;->a:Lcom/jieli/jl_filebrowse/bean/SDCardBean;

    iput-object p3, p0, Lcom/jieli/jl_filebrowse/FileBrowseManager$2;->b:Lcom/jieli/jl_filebrowse/interfaces/OperatCallback;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onError(I)V
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_filebrowse/FileBrowseManager$2;->c:Lcom/jieli/jl_filebrowse/FileBrowseManager;

    invoke-static {v0}, Lcom/jieli/jl_filebrowse/FileBrowseManager;->b(Lcom/jieli/jl_filebrowse/FileBrowseManager;)V

    iget-object v0, p0, Lcom/jieli/jl_filebrowse/FileBrowseManager$2;->b:Lcom/jieli/jl_filebrowse/interfaces/OperatCallback;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Lcom/jieli/jl_filebrowse/interfaces/OperatCallback;->onError(I)V

    :cond_0
    return-void
.end method

.method public onSuccess()V
    .locals 2

    iget-object v0, p0, Lcom/jieli/jl_filebrowse/FileBrowseManager$2;->c:Lcom/jieli/jl_filebrowse/FileBrowseManager;

    iget-object v1, p0, Lcom/jieli/jl_filebrowse/FileBrowseManager$2;->a:Lcom/jieli/jl_filebrowse/bean/SDCardBean;

    invoke-virtual {v0, v1}, Lcom/jieli/jl_filebrowse/FileBrowseManager;->cleanCache(Lcom/jieli/jl_filebrowse/bean/SDCardBean;)V

    iget-object v0, p0, Lcom/jieli/jl_filebrowse/FileBrowseManager$2;->c:Lcom/jieli/jl_filebrowse/FileBrowseManager;

    invoke-static {v0}, Lcom/jieli/jl_filebrowse/FileBrowseManager;->b(Lcom/jieli/jl_filebrowse/FileBrowseManager;)V

    iget-object v0, p0, Lcom/jieli/jl_filebrowse/FileBrowseManager$2;->b:Lcom/jieli/jl_filebrowse/interfaces/OperatCallback;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/jieli/jl_filebrowse/interfaces/OperatCallback;->onSuccess()V

    :cond_0
    return-void
.end method
