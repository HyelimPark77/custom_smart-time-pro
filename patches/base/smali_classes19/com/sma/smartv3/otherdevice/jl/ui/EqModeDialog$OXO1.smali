.class public Lcom/sma/smartv3/otherdevice/jl/ui/EqModeDialog$OXO1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/bestmafen/androidbase/adapter/recyclerview/MultiItemTypeAdapter$iO;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/otherdevice/jl/ui/EqModeDialog;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic OXO1:Lcom/sma/smartv3/otherdevice/jl/adapter/EqModeAdapter;

.field public final synthetic XIi00iiXO:Lcom/sma/smartv3/otherdevice/jl/ui/EqModeDialog;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/otherdevice/jl/ui/EqModeDialog;Lcom/sma/smartv3/otherdevice/jl/adapter/EqModeAdapter;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x8010,
            0x1010
        }
        names = {
            "this$0",
            "val$eqModeAdapter"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/otherdevice/jl/ui/EqModeDialog$OXO1;->XIi00iiXO:Lcom/sma/smartv3/otherdevice/jl/ui/EqModeDialog;

    iput-object p2, p0, Lcom/sma/smartv3/otherdevice/jl/ui/EqModeDialog$OXO1;->OXO1:Lcom/sma/smartv3/otherdevice/jl/adapter/EqModeAdapter;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public OXO1(Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0,
            0x0
        }
        names = {
            "view",
            "holder",
            "position"
        }
    .end annotation

    iget-object p1, p0, Lcom/sma/smartv3/otherdevice/jl/ui/EqModeDialog$OXO1;->OXO1:Lcom/sma/smartv3/otherdevice/jl/adapter/EqModeAdapter;

    invoke-virtual {p1, p3}, Lcom/sma/smartv3/otherdevice/jl/adapter/EqModeAdapter;->select(I)V

    iget-object p1, p0, Lcom/sma/smartv3/otherdevice/jl/ui/EqModeDialog$OXO1;->XIi00iiXO:Lcom/sma/smartv3/otherdevice/jl/ui/EqModeDialog;

    invoke-virtual {p1}, Landroidx/fragment/app/DialogFragment;->dismiss()V

    iget-object p1, p0, Lcom/sma/smartv3/otherdevice/jl/ui/EqModeDialog$OXO1;->XIi00iiXO:Lcom/sma/smartv3/otherdevice/jl/ui/EqModeDialog;

    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lcom/sma/smartv3/otherdevice/jl/ui/EqModeDialog$OXO1;->XIi00iiXO:Lcom/sma/smartv3/otherdevice/jl/ui/EqModeDialog;

    invoke-static {p1}, Lcom/sma/smartv3/otherdevice/jl/ui/EqModeDialog;->iO(Lcom/sma/smartv3/otherdevice/jl/ui/EqModeDialog;)Lcom/sma/smartv3/otherdevice/jl/ui/EqModeDialog$XIi00iiXO;

    move-result-object p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lcom/sma/smartv3/otherdevice/jl/ui/EqModeDialog$OXO1;->OXO1:Lcom/sma/smartv3/otherdevice/jl/adapter/EqModeAdapter;

    invoke-virtual {p1}, Lcom/bestmafen/androidbase/adapter/recyclerview/MultiItemTypeAdapter;->getDatas()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1, p3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/jieli/jl_rcsp/model/device/EqInfo;

    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/device/EqInfo;->copy()Lcom/jieli/jl_rcsp/model/device/EqInfo;

    move-result-object p1

    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/device/EqInfo;->getMode()I

    move-result p2

    const/4 p3, 0x6

    if-ne p2, p3, :cond_0

    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/device/EqInfo;->getCount()I

    move-result p2

    new-array p2, p2, [B

    const/16 p3, 0x7f

    invoke-static {p2, p3}, Ljava/util/Arrays;->fill([BB)V

    invoke-virtual {p1, p2}, Lcom/jieli/jl_rcsp/model/device/EqInfo;->setValue([B)V

    :cond_0
    iget-object p2, p0, Lcom/sma/smartv3/otherdevice/jl/ui/EqModeDialog$OXO1;->XIi00iiXO:Lcom/sma/smartv3/otherdevice/jl/ui/EqModeDialog;

    invoke-static {p2}, Lcom/sma/smartv3/otherdevice/jl/ui/EqModeDialog;->iO(Lcom/sma/smartv3/otherdevice/jl/ui/EqModeDialog;)Lcom/sma/smartv3/otherdevice/jl/ui/EqModeDialog$XIi00iiXO;

    move-result-object p2

    invoke-interface {p2, p1}, Lcom/sma/smartv3/otherdevice/jl/ui/EqModeDialog$XIi00iiXO;->OXO1(Lcom/jieli/jl_rcsp/model/device/EqInfo;)V

    :cond_1
    return-void
.end method

.method public XIi00iiXO(Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)Z
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0,
            0x0
        }
        names = {
            "view",
            "holder",
            "position"
        }
    .end annotation

    const/4 p1, 0x0

    return p1
.end method
