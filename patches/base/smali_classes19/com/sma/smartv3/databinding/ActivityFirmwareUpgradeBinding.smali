.class public final Lcom/sma/smartv3/databinding/ActivityFirmwareUpgradeBinding;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/viewbinding/ViewBinding;


# instance fields
.field public final llDevInfo:Landroid/widget/LinearLayout;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field private final rootView:Landroid/widget/LinearLayout;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final tvAlreadyOta:Landroid/widget/TextView;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final tvCurrent:Lcom/sma/smartv3/view/text/PFBold;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final tvFirmwareUpgradeTopTip:Lcom/sma/smartv3/view/text/PFBold;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final tvInfo:Landroid/widget/TextView;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final tvLatest:Lcom/sma/smartv3/view/text/PFBold;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final tvSpeed:Landroid/widget/TextView;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final tvStep:Lcom/sma/smartv3/view/text/PFBold;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final tvTip:Lcom/sma/smartv3/view/text/PFMedium;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final tvUpdateDesc:Lcom/sma/smartv3/view/text/PFMedium;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field


# direct methods
.method private constructor <init>(Landroid/widget/LinearLayout;Landroid/widget/LinearLayout;Landroid/widget/TextView;Lcom/sma/smartv3/view/text/PFBold;Lcom/sma/smartv3/view/text/PFBold;Landroid/widget/TextView;Lcom/sma/smartv3/view/text/PFBold;Landroid/widget/TextView;Lcom/sma/smartv3/view/text/PFBold;Lcom/sma/smartv3/view/text/PFMedium;Lcom/sma/smartv3/view/text/PFMedium;)V
    .locals 0
    .param p1    # Landroid/widget/LinearLayout;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Landroid/widget/LinearLayout;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Landroid/widget/TextView;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p4    # Lcom/sma/smartv3/view/text/PFBold;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p5    # Lcom/sma/smartv3/view/text/PFBold;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p6    # Landroid/widget/TextView;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p7    # Lcom/sma/smartv3/view/text/PFBold;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p8    # Landroid/widget/TextView;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p9    # Lcom/sma/smartv3/view/text/PFBold;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p10    # Lcom/sma/smartv3/view/text/PFMedium;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p11    # Lcom/sma/smartv3/view/text/PFMedium;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0,
            0x0,
            0x0,
            0x0,
            0x0,
            0x0,
            0x0,
            0x0,
            0x0,
            0x0
        }
        names = {
            "rootView",
            "llDevInfo",
            "tvAlreadyOta",
            "tvCurrent",
            "tvFirmwareUpgradeTopTip",
            "tvInfo",
            "tvLatest",
            "tvSpeed",
            "tvStep",
            "tvTip",
            "tvUpdateDesc"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/sma/smartv3/databinding/ActivityFirmwareUpgradeBinding;->rootView:Landroid/widget/LinearLayout;

    iput-object p2, p0, Lcom/sma/smartv3/databinding/ActivityFirmwareUpgradeBinding;->llDevInfo:Landroid/widget/LinearLayout;

    iput-object p3, p0, Lcom/sma/smartv3/databinding/ActivityFirmwareUpgradeBinding;->tvAlreadyOta:Landroid/widget/TextView;

    iput-object p4, p0, Lcom/sma/smartv3/databinding/ActivityFirmwareUpgradeBinding;->tvCurrent:Lcom/sma/smartv3/view/text/PFBold;

    iput-object p5, p0, Lcom/sma/smartv3/databinding/ActivityFirmwareUpgradeBinding;->tvFirmwareUpgradeTopTip:Lcom/sma/smartv3/view/text/PFBold;

    iput-object p6, p0, Lcom/sma/smartv3/databinding/ActivityFirmwareUpgradeBinding;->tvInfo:Landroid/widget/TextView;

    iput-object p7, p0, Lcom/sma/smartv3/databinding/ActivityFirmwareUpgradeBinding;->tvLatest:Lcom/sma/smartv3/view/text/PFBold;

    iput-object p8, p0, Lcom/sma/smartv3/databinding/ActivityFirmwareUpgradeBinding;->tvSpeed:Landroid/widget/TextView;

    iput-object p9, p0, Lcom/sma/smartv3/databinding/ActivityFirmwareUpgradeBinding;->tvStep:Lcom/sma/smartv3/view/text/PFBold;

    iput-object p10, p0, Lcom/sma/smartv3/databinding/ActivityFirmwareUpgradeBinding;->tvTip:Lcom/sma/smartv3/view/text/PFMedium;

    iput-object p11, p0, Lcom/sma/smartv3/databinding/ActivityFirmwareUpgradeBinding;->tvUpdateDesc:Lcom/sma/smartv3/view/text/PFMedium;

    return-void
.end method

.method public static bind(Landroid/view/View;)Lcom/sma/smartv3/databinding/ActivityFirmwareUpgradeBinding;
    .locals 14
    .param p0    # Landroid/view/View;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "rootView"
        }
    .end annotation

    const v0, 0x7f0a06e3

    invoke-static {p0, v0}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v4, v1

    check-cast v4, Landroid/widget/LinearLayout;

    if-eqz v4, :cond_0

    const v0, 0x7f0a0c2e

    invoke-static {p0, v0}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v5, v1

    check-cast v5, Landroid/widget/TextView;

    if-eqz v5, :cond_0

    const v0, 0x7f0a0c5f

    invoke-static {p0, v0}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v6, v1

    check-cast v6, Lcom/sma/smartv3/view/text/PFBold;

    if-eqz v6, :cond_0

    const v0, 0x7f0a0c81

    invoke-static {p0, v0}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v7, v1

    check-cast v7, Lcom/sma/smartv3/view/text/PFBold;

    if-eqz v7, :cond_0

    const v0, 0x7f0a0c9c

    invoke-static {p0, v0}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v8, v1

    check-cast v8, Landroid/widget/TextView;

    if-eqz v8, :cond_0

    const v0, 0x7f0a0ca2

    invoke-static {p0, v0}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v9, v1

    check-cast v9, Lcom/sma/smartv3/view/text/PFBold;

    if-eqz v9, :cond_0

    const v0, 0x7f0a0d0f

    invoke-static {p0, v0}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v10, v1

    check-cast v10, Landroid/widget/TextView;

    if-eqz v10, :cond_0

    const v0, 0x7f0a0d19

    invoke-static {p0, v0}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v11, v1

    check-cast v11, Lcom/sma/smartv3/view/text/PFBold;

    if-eqz v11, :cond_0

    const v0, 0x7f0a188f

    invoke-static {p0, v0}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v12, v1

    check-cast v12, Lcom/sma/smartv3/view/text/PFMedium;

    if-eqz v12, :cond_0

    const v0, 0x7f0a18ad

    invoke-static {p0, v0}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v13, v1

    check-cast v13, Lcom/sma/smartv3/view/text/PFMedium;

    if-eqz v13, :cond_0

    new-instance v2, Lcom/sma/smartv3/databinding/ActivityFirmwareUpgradeBinding;

    move-object v3, p0

    check-cast v3, Landroid/widget/LinearLayout;

    invoke-direct/range {v2 .. v13}, Lcom/sma/smartv3/databinding/ActivityFirmwareUpgradeBinding;-><init>(Landroid/widget/LinearLayout;Landroid/widget/LinearLayout;Landroid/widget/TextView;Lcom/sma/smartv3/view/text/PFBold;Lcom/sma/smartv3/view/text/PFBold;Landroid/widget/TextView;Lcom/sma/smartv3/view/text/PFBold;Landroid/widget/TextView;Lcom/sma/smartv3/view/text/PFBold;Lcom/sma/smartv3/view/text/PFMedium;Lcom/sma/smartv3/view/text/PFMedium;)V

    return-object v2

    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p0

    invoke-virtual {p0, v0}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    move-result-object p0

    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "Missing required view with ID: "

    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static inflate(Landroid/view/LayoutInflater;)Lcom/sma/smartv3/databinding/ActivityFirmwareUpgradeBinding;
    .locals 2
    .param p0    # Landroid/view/LayoutInflater;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "inflater"
        }
    .end annotation

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 1
    invoke-static {p0, v0, v1}, Lcom/sma/smartv3/databinding/ActivityFirmwareUpgradeBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/sma/smartv3/databinding/ActivityFirmwareUpgradeBinding;

    move-result-object p0

    return-object p0
.end method

.method public static inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/sma/smartv3/databinding/ActivityFirmwareUpgradeBinding;
    .locals 2
    .param p0    # Landroid/view/LayoutInflater;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p1    # Landroid/view/ViewGroup;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0,
            0x0
        }
        names = {
            "inflater",
            "parent",
            "attachToParent"
        }
    .end annotation

    const v0, 0x7f0d00a2

    const/4 v1, 0x0

    .line 2
    invoke-virtual {p0, v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p0

    if-eqz p2, :cond_0

    .line 3
    invoke-virtual {p1, p0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 4
    :cond_0
    invoke-static {p0}, Lcom/sma/smartv3/databinding/ActivityFirmwareUpgradeBinding;->bind(Landroid/view/View;)Lcom/sma/smartv3/databinding/ActivityFirmwareUpgradeBinding;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public bridge synthetic getRoot()Landroid/view/View;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/sma/smartv3/databinding/ActivityFirmwareUpgradeBinding;->getRoot()Landroid/widget/LinearLayout;

    move-result-object v0

    return-object v0
.end method

.method public getRoot()Landroid/widget/LinearLayout;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 2
    iget-object v0, p0, Lcom/sma/smartv3/databinding/ActivityFirmwareUpgradeBinding;->rootView:Landroid/widget/LinearLayout;

    return-object v0
.end method
