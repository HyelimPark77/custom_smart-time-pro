.class public final Lcom/sma/smartv3/databinding/ActivityHrMonitoringSettingsBinding;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/viewbinding/ViewBinding;


# instance fields
.field public final itemHeader:Lcom/sma/smartv3/view/AbhSettingsHeader;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final itemHeaderHigh:Lcom/sma/smartv3/view/AbhSettingsHeader;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final itemHeaderLow:Lcom/sma/smartv3/view/AbhSettingsHeader;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final itemHeaderReal:Lcom/sma/smartv3/view/AbhSettingsHeader;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final itemHeaderSmart:Lcom/sma/smartv3/view/AbhSettingsHeader;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final itemHighValue:Lcom/sma/smartv3/view/AbhSettingsItem;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final itemInterval:Lcom/sma/smartv3/view/AbhSettingsItem;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final itemLowValue:Lcom/sma/smartv3/view/AbhSettingsItem;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final itemTimeRange:Lcom/sma/smartv3/view/AbhSettingsItem;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final llModePanel:Landroid/widget/LinearLayout;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final llTimePanel:Landroid/widget/LinearLayout;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final llWarnPanel:Landroid/widget/LinearLayout;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final root:Landroid/widget/LinearLayout;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field private final rootView:Landroid/widget/LinearLayout;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field


# direct methods
.method private constructor <init>(Landroid/widget/LinearLayout;Lcom/sma/smartv3/view/AbhSettingsHeader;Lcom/sma/smartv3/view/AbhSettingsHeader;Lcom/sma/smartv3/view/AbhSettingsHeader;Lcom/sma/smartv3/view/AbhSettingsHeader;Lcom/sma/smartv3/view/AbhSettingsHeader;Lcom/sma/smartv3/view/AbhSettingsItem;Lcom/sma/smartv3/view/AbhSettingsItem;Lcom/sma/smartv3/view/AbhSettingsItem;Lcom/sma/smartv3/view/AbhSettingsItem;Landroid/widget/LinearLayout;Landroid/widget/LinearLayout;Landroid/widget/LinearLayout;Landroid/widget/LinearLayout;)V
    .locals 0
    .param p1    # Landroid/widget/LinearLayout;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/sma/smartv3/view/AbhSettingsHeader;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Lcom/sma/smartv3/view/AbhSettingsHeader;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p4    # Lcom/sma/smartv3/view/AbhSettingsHeader;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p5    # Lcom/sma/smartv3/view/AbhSettingsHeader;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p6    # Lcom/sma/smartv3/view/AbhSettingsHeader;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p7    # Lcom/sma/smartv3/view/AbhSettingsItem;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p8    # Lcom/sma/smartv3/view/AbhSettingsItem;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p9    # Lcom/sma/smartv3/view/AbhSettingsItem;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p10    # Lcom/sma/smartv3/view/AbhSettingsItem;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p11    # Landroid/widget/LinearLayout;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p12    # Landroid/widget/LinearLayout;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p13    # Landroid/widget/LinearLayout;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p14    # Landroid/widget/LinearLayout;
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
            0x0,
            0x0,
            0x0,
            0x0
        }
        names = {
            "rootView",
            "itemHeader",
            "itemHeaderHigh",
            "itemHeaderLow",
            "itemHeaderReal",
            "itemHeaderSmart",
            "itemHighValue",
            "itemInterval",
            "itemLowValue",
            "itemTimeRange",
            "llModePanel",
            "llTimePanel",
            "llWarnPanel",
            "root"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/sma/smartv3/databinding/ActivityHrMonitoringSettingsBinding;->rootView:Landroid/widget/LinearLayout;

    iput-object p2, p0, Lcom/sma/smartv3/databinding/ActivityHrMonitoringSettingsBinding;->itemHeader:Lcom/sma/smartv3/view/AbhSettingsHeader;

    iput-object p3, p0, Lcom/sma/smartv3/databinding/ActivityHrMonitoringSettingsBinding;->itemHeaderHigh:Lcom/sma/smartv3/view/AbhSettingsHeader;

    iput-object p4, p0, Lcom/sma/smartv3/databinding/ActivityHrMonitoringSettingsBinding;->itemHeaderLow:Lcom/sma/smartv3/view/AbhSettingsHeader;

    iput-object p5, p0, Lcom/sma/smartv3/databinding/ActivityHrMonitoringSettingsBinding;->itemHeaderReal:Lcom/sma/smartv3/view/AbhSettingsHeader;

    iput-object p6, p0, Lcom/sma/smartv3/databinding/ActivityHrMonitoringSettingsBinding;->itemHeaderSmart:Lcom/sma/smartv3/view/AbhSettingsHeader;

    iput-object p7, p0, Lcom/sma/smartv3/databinding/ActivityHrMonitoringSettingsBinding;->itemHighValue:Lcom/sma/smartv3/view/AbhSettingsItem;

    iput-object p8, p0, Lcom/sma/smartv3/databinding/ActivityHrMonitoringSettingsBinding;->itemInterval:Lcom/sma/smartv3/view/AbhSettingsItem;

    iput-object p9, p0, Lcom/sma/smartv3/databinding/ActivityHrMonitoringSettingsBinding;->itemLowValue:Lcom/sma/smartv3/view/AbhSettingsItem;

    iput-object p10, p0, Lcom/sma/smartv3/databinding/ActivityHrMonitoringSettingsBinding;->itemTimeRange:Lcom/sma/smartv3/view/AbhSettingsItem;

    iput-object p11, p0, Lcom/sma/smartv3/databinding/ActivityHrMonitoringSettingsBinding;->llModePanel:Landroid/widget/LinearLayout;

    iput-object p12, p0, Lcom/sma/smartv3/databinding/ActivityHrMonitoringSettingsBinding;->llTimePanel:Landroid/widget/LinearLayout;

    iput-object p13, p0, Lcom/sma/smartv3/databinding/ActivityHrMonitoringSettingsBinding;->llWarnPanel:Landroid/widget/LinearLayout;

    iput-object p14, p0, Lcom/sma/smartv3/databinding/ActivityHrMonitoringSettingsBinding;->root:Landroid/widget/LinearLayout;

    return-void
.end method

.method public static bind(Landroid/view/View;)Lcom/sma/smartv3/databinding/ActivityHrMonitoringSettingsBinding;
    .locals 18
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

    move-object/from16 v0, p0

    const v1, 0x7f0a0594

    invoke-static {v0, v1}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v5, v2

    check-cast v5, Lcom/sma/smartv3/view/AbhSettingsHeader;

    if-eqz v5, :cond_0

    const v1, 0x7f0a0596

    invoke-static {v0, v1}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v6, v2

    check-cast v6, Lcom/sma/smartv3/view/AbhSettingsHeader;

    if-eqz v6, :cond_0

    const v1, 0x7f0a059b

    invoke-static {v0, v1}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v7, v2

    check-cast v7, Lcom/sma/smartv3/view/AbhSettingsHeader;

    if-eqz v7, :cond_0

    const v1, 0x7f0a059e

    invoke-static {v0, v1}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v8, v2

    check-cast v8, Lcom/sma/smartv3/view/AbhSettingsHeader;

    if-eqz v8, :cond_0

    const v1, 0x7f0a05a4

    invoke-static {v0, v1}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v9, v2

    check-cast v9, Lcom/sma/smartv3/view/AbhSettingsHeader;

    if-eqz v9, :cond_0

    const v1, 0x7f0a05aa

    invoke-static {v0, v1}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v10, v2

    check-cast v10, Lcom/sma/smartv3/view/AbhSettingsItem;

    if-eqz v10, :cond_0

    const v1, 0x7f0a05ac

    invoke-static {v0, v1}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v11, v2

    check-cast v11, Lcom/sma/smartv3/view/AbhSettingsItem;

    if-eqz v11, :cond_0

    const v1, 0x7f0a05c4

    invoke-static {v0, v1}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v12, v2

    check-cast v12, Lcom/sma/smartv3/view/AbhSettingsItem;

    if-eqz v12, :cond_0

    const v1, 0x7f0a05ee

    invoke-static {v0, v1}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v13, v2

    check-cast v13, Lcom/sma/smartv3/view/AbhSettingsItem;

    if-eqz v13, :cond_0

    const v1, 0x7f0a0709

    invoke-static {v0, v1}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v14, v2

    check-cast v14, Landroid/widget/LinearLayout;

    if-eqz v14, :cond_0

    const v1, 0x7f0a0728

    invoke-static {v0, v1}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v15, v2

    check-cast v15, Landroid/widget/LinearLayout;

    if-eqz v15, :cond_0

    const v1, 0x7f0a0731

    invoke-static {v0, v1}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object/from16 v16, v2

    check-cast v16, Landroid/widget/LinearLayout;

    if-eqz v16, :cond_0

    move-object v4, v0

    check-cast v4, Landroid/widget/LinearLayout;

    new-instance v3, Lcom/sma/smartv3/databinding/ActivityHrMonitoringSettingsBinding;

    move-object/from16 v17, v4

    invoke-direct/range {v3 .. v17}, Lcom/sma/smartv3/databinding/ActivityHrMonitoringSettingsBinding;-><init>(Landroid/widget/LinearLayout;Lcom/sma/smartv3/view/AbhSettingsHeader;Lcom/sma/smartv3/view/AbhSettingsHeader;Lcom/sma/smartv3/view/AbhSettingsHeader;Lcom/sma/smartv3/view/AbhSettingsHeader;Lcom/sma/smartv3/view/AbhSettingsHeader;Lcom/sma/smartv3/view/AbhSettingsItem;Lcom/sma/smartv3/view/AbhSettingsItem;Lcom/sma/smartv3/view/AbhSettingsItem;Lcom/sma/smartv3/view/AbhSettingsItem;Landroid/widget/LinearLayout;Landroid/widget/LinearLayout;Landroid/widget/LinearLayout;Landroid/widget/LinearLayout;)V

    return-object v3

    :cond_0
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/NullPointerException;

    const-string v2, "Missing required view with ID: "

    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public static inflate(Landroid/view/LayoutInflater;)Lcom/sma/smartv3/databinding/ActivityHrMonitoringSettingsBinding;
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
    invoke-static {p0, v0, v1}, Lcom/sma/smartv3/databinding/ActivityHrMonitoringSettingsBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/sma/smartv3/databinding/ActivityHrMonitoringSettingsBinding;

    move-result-object p0

    return-object p0
.end method

.method public static inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/sma/smartv3/databinding/ActivityHrMonitoringSettingsBinding;
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

    const v0, 0x7f0d00b6

    const/4 v1, 0x0

    .line 2
    invoke-virtual {p0, v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p0

    if-eqz p2, :cond_0

    .line 3
    invoke-virtual {p1, p0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 4
    :cond_0
    invoke-static {p0}, Lcom/sma/smartv3/databinding/ActivityHrMonitoringSettingsBinding;->bind(Landroid/view/View;)Lcom/sma/smartv3/databinding/ActivityHrMonitoringSettingsBinding;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public bridge synthetic getRoot()Landroid/view/View;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/sma/smartv3/databinding/ActivityHrMonitoringSettingsBinding;->getRoot()Landroid/widget/LinearLayout;

    move-result-object v0

    return-object v0
.end method

.method public getRoot()Landroid/widget/LinearLayout;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 2
    iget-object v0, p0, Lcom/sma/smartv3/databinding/ActivityHrMonitoringSettingsBinding;->rootView:Landroid/widget/LinearLayout;

    return-object v0
.end method
