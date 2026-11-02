.class public Lcom/jieli/jl_rcsp/model/command/AlarmExpandCmd$Response;
.super Lcom/jieli/jl_rcsp/model/base/CommonResponse;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/jieli/jl_rcsp/model/command/AlarmExpandCmd;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Response"
.end annotation


# instance fields
.field private final op:B


# direct methods
.method public constructor <init>(B)V
    .locals 0

    invoke-direct {p0}, Lcom/jieli/jl_rcsp/model/base/CommonResponse;-><init>()V

    iput-byte p1, p0, Lcom/jieli/jl_rcsp/model/command/AlarmExpandCmd$Response;->op:B

    return-void
.end method


# virtual methods
.method public getOp()B
    .locals 1

    iget-byte v0, p0, Lcom/jieli/jl_rcsp/model/command/AlarmExpandCmd$Response;->op:B

    return v0
.end method
