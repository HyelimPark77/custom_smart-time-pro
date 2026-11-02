.class public final synthetic Lcom/jieli/jl_rcsp/tool/datahandles/OXO1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic I1:Lcom/jieli/jl_rcsp/model/DataInfo;

.field public final synthetic IO:Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld$DataHandlerThread;

.field public final synthetic X11iII1O1:Lcom/jieli/jl_rcsp/model/base/BasePacket;

.field public final synthetic iX1O1:Lcom/jieli/jl_rcsp/model/base/BasePacket;


# direct methods
.method public synthetic constructor <init>(Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld$DataHandlerThread;Lcom/jieli/jl_rcsp/model/DataInfo;Lcom/jieli/jl_rcsp/model/base/BasePacket;Lcom/jieli/jl_rcsp/model/base/BasePacket;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/jieli/jl_rcsp/tool/datahandles/OXO1;->IO:Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld$DataHandlerThread;

    iput-object p2, p0, Lcom/jieli/jl_rcsp/tool/datahandles/OXO1;->I1:Lcom/jieli/jl_rcsp/model/DataInfo;

    iput-object p3, p0, Lcom/jieli/jl_rcsp/tool/datahandles/OXO1;->iX1O1:Lcom/jieli/jl_rcsp/model/base/BasePacket;

    iput-object p4, p0, Lcom/jieli/jl_rcsp/tool/datahandles/OXO1;->X11iII1O1:Lcom/jieli/jl_rcsp/model/base/BasePacket;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Lcom/jieli/jl_rcsp/tool/datahandles/OXO1;->IO:Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld$DataHandlerThread;

    iget-object v1, p0, Lcom/jieli/jl_rcsp/tool/datahandles/OXO1;->I1:Lcom/jieli/jl_rcsp/model/DataInfo;

    iget-object v2, p0, Lcom/jieli/jl_rcsp/tool/datahandles/OXO1;->iX1O1:Lcom/jieli/jl_rcsp/model/base/BasePacket;

    iget-object v3, p0, Lcom/jieli/jl_rcsp/tool/datahandles/OXO1;->X11iII1O1:Lcom/jieli/jl_rcsp/model/base/BasePacket;

    invoke-virtual {v0, v1, v2, v3}, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld$DataHandlerThread;->a(Lcom/jieli/jl_rcsp/model/DataInfo;Lcom/jieli/jl_rcsp/model/base/BasePacket;Lcom/jieli/jl_rcsp/model/base/BasePacket;)V

    return-void
.end method
