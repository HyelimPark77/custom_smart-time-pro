.class public final synthetic Lcom/jieli/jl_rcsp/impl/OXO1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Handler$Callback;


# instance fields
.field public final synthetic IO:Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;


# direct methods
.method public synthetic constructor <init>(Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/jieli/jl_rcsp/impl/OXO1;->IO:Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;

    return-void
.end method


# virtual methods
.method public final handleMessage(Landroid/os/Message;)Z
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/OXO1;->IO:Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;

    invoke-virtual {v0, p1}, Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;->a(Landroid/os/Message;)Z

    move-result p1

    return p1
.end method
