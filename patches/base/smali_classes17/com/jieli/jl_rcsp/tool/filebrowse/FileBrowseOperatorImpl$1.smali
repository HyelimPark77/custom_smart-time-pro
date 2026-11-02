.class Lcom/jieli/jl_rcsp/tool/filebrowse/FileBrowseOperatorImpl$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/jieli/jl_filebrowse/interfaces/OperatCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/jieli/jl_rcsp/tool/filebrowse/FileBrowseOperatorImpl;->deleteFile(IBIZZLcom/jieli/jl_filebrowse/interfaces/OperatCallback;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:I

.field public final synthetic b:B

.field public final synthetic c:I

.field public final synthetic d:Z

.field public final synthetic e:Lcom/jieli/jl_filebrowse/interfaces/OperatCallback;

.field public final synthetic f:Lcom/jieli/jl_rcsp/tool/filebrowse/FileBrowseOperatorImpl;


# direct methods
.method public constructor <init>(Lcom/jieli/jl_rcsp/tool/filebrowse/FileBrowseOperatorImpl;IBIZLcom/jieli/jl_filebrowse/interfaces/OperatCallback;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lcom/jieli/jl_rcsp/tool/filebrowse/FileBrowseOperatorImpl$1;->f:Lcom/jieli/jl_rcsp/tool/filebrowse/FileBrowseOperatorImpl;

    iput p2, p0, Lcom/jieli/jl_rcsp/tool/filebrowse/FileBrowseOperatorImpl$1;->a:I

    iput-byte p3, p0, Lcom/jieli/jl_rcsp/tool/filebrowse/FileBrowseOperatorImpl$1;->b:B

    iput p4, p0, Lcom/jieli/jl_rcsp/tool/filebrowse/FileBrowseOperatorImpl$1;->c:I

    iput-boolean p5, p0, Lcom/jieli/jl_rcsp/tool/filebrowse/FileBrowseOperatorImpl$1;->d:Z

    iput-object p6, p0, Lcom/jieli/jl_rcsp/tool/filebrowse/FileBrowseOperatorImpl$1;->e:Lcom/jieli/jl_filebrowse/interfaces/OperatCallback;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onError(I)V
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/tool/filebrowse/FileBrowseOperatorImpl$1;->e:Lcom/jieli/jl_filebrowse/interfaces/OperatCallback;

    invoke-interface {v0, p1}, Lcom/jieli/jl_filebrowse/interfaces/OperatCallback;->onError(I)V

    return-void
.end method

.method public onSuccess()V
    .locals 6

    iget-object v0, p0, Lcom/jieli/jl_rcsp/tool/filebrowse/FileBrowseOperatorImpl$1;->f:Lcom/jieli/jl_rcsp/tool/filebrowse/FileBrowseOperatorImpl;

    iget v1, p0, Lcom/jieli/jl_rcsp/tool/filebrowse/FileBrowseOperatorImpl$1;->a:I

    iget-byte v2, p0, Lcom/jieli/jl_rcsp/tool/filebrowse/FileBrowseOperatorImpl$1;->b:B

    iget v3, p0, Lcom/jieli/jl_rcsp/tool/filebrowse/FileBrowseOperatorImpl$1;->c:I

    iget-boolean v4, p0, Lcom/jieli/jl_rcsp/tool/filebrowse/FileBrowseOperatorImpl$1;->d:Z

    iget-object v5, p0, Lcom/jieli/jl_rcsp/tool/filebrowse/FileBrowseOperatorImpl$1;->e:Lcom/jieli/jl_filebrowse/interfaces/OperatCallback;

    invoke-static/range {v0 .. v5}, Lcom/jieli/jl_rcsp/tool/filebrowse/FileBrowseOperatorImpl;->a(Lcom/jieli/jl_rcsp/tool/filebrowse/FileBrowseOperatorImpl;IBIZLcom/jieli/jl_filebrowse/interfaces/OperatCallback;)V

    return-void
.end method
