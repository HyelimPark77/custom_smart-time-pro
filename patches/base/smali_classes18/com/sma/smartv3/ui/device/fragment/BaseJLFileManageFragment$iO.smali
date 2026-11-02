.class public final Lcom/sma/smartv3/ui/device/fragment/BaseJLFileManageFragment$iO;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/sma/smartv3/ui/device/XIi00iiXO$OXO1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/device/fragment/BaseJLFileManageFragment;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic OXO1:Lcom/sma/smartv3/ui/device/fragment/BaseJLFileManageFragment;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/device/fragment/BaseJLFileManageFragment;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/fragment/BaseJLFileManageFragment$iO;->OXO1:Lcom/sma/smartv3/ui/device/fragment/BaseJLFileManageFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public I0IIOi(II)V
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/fragment/BaseJLFileManageFragment$iO;->OXO1:Lcom/sma/smartv3/ui/device/fragment/BaseJLFileManageFragment;

    invoke-static {v0, p1, p2}, Lcom/sma/smartv3/ui/device/fragment/BaseJLFileManageFragment;->access$refreshTaskPanel(Lcom/sma/smartv3/ui/device/fragment/BaseJLFileManageFragment;II)V

    return-void
.end method

.method public I0iXXO(I)V
    .locals 0

    return-void
.end method

.method public IiI10X(I)V
    .locals 2

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/fragment/BaseJLFileManageFragment$iO;->OXO1:Lcom/sma/smartv3/ui/device/fragment/BaseJLFileManageFragment;

    const/4 v1, 0x0

    invoke-static {v0, p1, v1}, Lcom/sma/smartv3/ui/device/fragment/BaseJLFileManageFragment;->access$refreshTaskPanel(Lcom/sma/smartv3/ui/device/fragment/BaseJLFileManageFragment;II)V

    return-void
.end method

.method public OIi0(IZ)V
    .locals 0

    return-void
.end method

.method public XIi00iiXO(I)V
    .locals 0

    invoke-super {p0, p1}, Lcom/sma/smartv3/ui/device/XIi00iiXO$OXO1;->XIi00iiXO(I)V

    sget-object p1, Lcom/sma/smartv3/ui/device/XIi00iiXO;->OXO1:Lcom/sma/smartv3/ui/device/XIi00iiXO;

    invoke-virtual {p1}, Lcom/sma/smartv3/ui/device/XIi00iiXO;->I1()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/fragment/BaseJLFileManageFragment$iO;->OXO1:Lcom/sma/smartv3/ui/device/fragment/BaseJLFileManageFragment;

    invoke-static {p1}, Lcom/sma/smartv3/ui/device/fragment/BaseJLFileManageFragment;->access$dismissLoadPopup(Lcom/sma/smartv3/ui/device/fragment/BaseJLFileManageFragment;)V

    :cond_0
    return-void
.end method

.method public XO0O10(IILjava/lang/String;)V
    .locals 0

    const-string p1, "msg"

    invoke-static {p3, p1}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method
